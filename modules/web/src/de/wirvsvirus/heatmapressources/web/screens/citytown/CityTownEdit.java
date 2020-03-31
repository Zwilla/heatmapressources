package de.wirvsvirus.heatmapressources.web.screens.citytown;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.FontPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.GeometryStyle;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.addon.maps.web.gui.components.layer.style.PolygonStyle;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("heatmapressources_CityTown.edit")
@UiDescriptor("city-town-edit.xml")
@EditedEntityContainer("cityTownsIc")
@LoadDataBeforeShow
public class CityTownEdit extends StandardEditor<CityTown> {

    @Inject
    private GeoMap Map;
    @Inject
    private InstanceContainer<CityTown> cityTownsIc;
    private CityTown myCityTown;


    @Install(to = "humansLayer", subject = "styleProvider")
    private GeometryStyle myHumansLayerStyle(CityTown myCityTown){
        this.myCityTown = myCityTown;
        return new PointStyle(new FontPointIcon(CubaIcon.HOME));
    }

    @Install(to = "districtLayer", subject = "styleProvider")
    private GeometryStyle mydistrictLayerStyle(CityTown myCityTown){
        this.myCityTown = myCityTown;
        return new PolygonStyle()
                .setFillColor("green")
                .setStrokeColor("darkgreen")
                .setStrokeWeight(2);
    }

}
