package de.wirvsvirus.heatmapressources.web.screens.emergencytransportation;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.emergencytransportation.EmergencyTransportation;

@UiController("heatmapressources_EmergencyTransportation.browse")
@UiDescriptor("emergency-transportation-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class EmergencyTransportationBrowse_masterDetail extends MasterDetailScreen<EmergencyTransportation> {
}
