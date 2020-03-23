package de.wirvsvirus.heatmapressources.web.screens.dashbord;

import de.wirvsvirus.heatmapressources.entity.heatmaps.LayerWrapper;
import de.wirvsvirus.heatmapressources.entity.hospital.Hospital;
import com.haulmont.addon.maps.gis.GeometryPropertiesResolver;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.HeatMapOptions;
import com.haulmont.addon.maps.web.gui.components.layer.style.FontPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.GeometryStyle;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.addon.maps.web.toolkit.ui.leaflet.LMap;
import com.haulmont.addon.maps.web.toolkit.ui.leaflet.LeafletOverlayAddEvent;
import com.haulmont.addon.maps.web.toolkit.ui.leaflet.LeafletOverlayAddListener;
import com.haulmont.addon.maps.web.toolkit.ui.leaflet.heat.LHeatMapLayer;
import com.haulmont.chile.core.model.MetaProperty;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TokenList;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.vaadin.ui.HasComponents;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.Point;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;


@UiController("covid_MapScreen")
@UiDescriptor("map-screen.xml")
@LoadDataBeforeShow
public class MapScreen extends Screen {

    @Inject
    private DataManager dataManager;
    @Inject
    private GeoMap mainMap;
    @Inject
    private GeometryPropertiesResolver geometryPropertiesResolver;

    private LHeatMapLayer heatMapLayer = null;

    @Subscribe
    public void onAfterInit(AfterInitEvent event) {
        //hack to remove unwanted heat map
        LMap leafletMap = mainMap.unwrap(LMap.class);
        leafletMap.addComponentAttachListener(listener -> {
            if (listener.getAttachedComponent() instanceof LHeatMapLayer) {
                if (heatMapLayer != null)
                    leafletMap.removeComponent(heatMapLayer);
                heatMapLayer = (LHeatMapLayer) listener.getAttachedComponent();
            }
        });

    }

    @Install(to = "mainMap.hospitalsLayer", subject = "styleProvider")
    private GeometryStyle hospitalsLayerStyleProvider(Hospital hospital) {
        return new PointStyle(
                new FontPointIcon(CubaIcon.PLUS)
                        .setIconPathFillColor("#ff0000")
                        .setIconTextFillColor("white")
                        .setIconPathStrokeColor("black"));
    }

    @Install(to = "layersLoader", target = Target.DATA_LOADER)
    private List<LayerWrapper> layersLoaderLoadDelegate(LoadContext<LayerWrapper> loadContext) {

        //filter all datacontainers with required data and put them to be available for heatmap selection
        List<LayerWrapper> mapLayers = getScreenData().getContainerIds().stream()
                .filter(idx -> idx.startsWith("map"))
                .map(idx -> {
                    LayerWrapper lw = dataManager.create(LayerWrapper.class);
                    lw.setName(getScreenData().getContainer(idx).getEntityMetaClass().getJavaClass().getSimpleName());
                    lw.setDataContainerId(idx);
                    return lw;
                }).collect(Collectors.toList());;

        return mapLayers;
}

    @Subscribe("layersForHeatmaps")
    public void onLayersForHeatmapsValueChange(HasValue.ValueChangeEvent<Collection<LayerWrapper>> event) {
        //adding heatmap
        Map<Point, Double> intensityMap = new HashMap<>();

        Objects.requireNonNull(event.getValue()).forEach(lw -> {
            CollectionContainer<Entity<String>> container = getScreenData().getContainer(lw.getDataContainerId());
            List<Entity<String>> items = container.getMutableItems();

            Collection<MetaProperty> geometryProperties = geometryPropertiesResolver.getGeometryProperties(container.getEntityMetaClass());
            if (geometryProperties.size() != 1)
                return;
            MetaProperty metaGeoProperty = geometryProperties.iterator().next();

            items.forEach(i -> {

                Geometry geometry = i.getValue(metaGeoProperty.getName());
                if (geometry instanceof Point)
                    intensityMap.put((Point)geometry, 15d);
            });
        });
        mainMap.addHeatMap(intensityMap,
                new HeatMapOptions()
                    .setMinOpacity(0.3)
        );
    }

}
