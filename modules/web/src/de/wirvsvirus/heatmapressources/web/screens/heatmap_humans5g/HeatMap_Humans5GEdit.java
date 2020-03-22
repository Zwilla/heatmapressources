package de.wirvsvirus.heatmapressources.web.screens.heatmap_humans5g;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.heatmaps.HeatMap_Humans5G;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("heatmapressources_HeatMap_Humans5G.edit")
@UiDescriptor("heat-map_humans5g-edit.xml")
@EditedEntityContainer("heatMap_Humans5GDc")
@LoadDataBeforeShow
public class HeatMap_Humans5GEdit extends StandardEditor<HeatMap_Humans5G> {
    @Inject
    private GeoMap casesMap;
    @Inject
    private InstanceContainer<HeatMap_Humans5G> heatMap_Humans5GDc;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Point location = heatMap_Humans5GDc.getItem().getHmH_Location();
        if (location != null) {
            casesMap.setCenter(location.getX(), location.getY());
        }
    }
}
