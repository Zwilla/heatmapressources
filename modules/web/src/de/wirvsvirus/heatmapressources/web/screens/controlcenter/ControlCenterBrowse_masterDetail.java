package de.wirvsvirus.heatmapressources.web.screens.controlcenter;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;

@UiController("heatmapressources_ControlCenter.browse")
@UiDescriptor("control-center-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ControlCenterBrowse_masterDetail extends MasterDetailScreen<ControlCenter> {
}
