package de.wirvsvirus.heatmapressources.web.screens.hospital;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.heatmaps.HeatMap_Humans5G;
import de.wirvsvirus.heatmapressources.entity.hospital.Hospital;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("heatmapressources_Hospital.browse")
@UiDescriptor("hospital-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HospitalBrowse_masterDetail extends MasterDetailScreen<Hospital> {
    @Inject
    private GeoMap Map;
    @Inject
    private InstanceContainer<Hospital> hospitalDc;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Point location = hospitalDc.getItem().getLocation();
        if (location != null) {
            Map.setCenter(location.getX(), location.getY());
        }
    }
}
