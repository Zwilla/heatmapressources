package de.wirvsvirus.heatmapressources.web.screens.dashbord;

import de.wirvsvirus.heatmapressources.entity.heatmaps.HeatMap_Humans5G;
import de.wirvsvirus.heatmapressources.entity.hospital.Hospital;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.FontPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.GeometryStyle;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@UiController("covid_MapScreen")
@UiDescriptor("map-screen.xml")
@LoadDataBeforeShow
public class MapScreen extends Screen {
    @Install(to = "mainMap.hospitalsLayer", subject = "styleProvider")
    private GeometryStyle hospitalsLayerStyleProvider(Hospital hospital) {
        return new PointStyle(
                new FontPointIcon(CubaIcon.PLUS)
                        .setIconPathFillColor("#ff0000")
                        .setIconTextFillColor("white")
                        .setIconPathStrokeColor("black"));
    }

}
