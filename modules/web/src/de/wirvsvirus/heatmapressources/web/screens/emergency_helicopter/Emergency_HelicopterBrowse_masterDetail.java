package de.wirvsvirus.heatmapressources.web.screens.emergency_helicopter;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.emergencytransportation.Emergency_Helicopter;

@UiController("heatmapressources_Emergency_Helicopter.browse")
@UiDescriptor("emergency_helicopter-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class Emergency_HelicopterBrowse_masterDetail extends MasterDetailScreen<Emergency_Helicopter> {
}
