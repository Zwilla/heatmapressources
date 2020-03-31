package de.wirvsvirus.heatmapressources.web.screens.controlcenter;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("heatmapressources_ControlCenter.browse")
@UiDescriptor("control-center-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ControlCenterBrowse_masterDetail extends MasterDetailScreen<ControlCenter> {

    @Inject
    private GeoMap ControlCenterMap;
    @Inject
    private InstanceContainer<ControlCenter> controlCentersDc;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Point location = controlCentersDc.getItem().getCc_location();
        if (location != null) {
            ControlCenterMap.setCenter(location.getX(), location.getY());
        }
    }
}
