package de.wirvsvirus.heatmapressources.web.screens.hospitalroomfacilities;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.HospitalRoomFacilities;

@UiController("heatmapressources_HospitalRoomFacilities.browse")
@UiDescriptor("hospital-room-facilities-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HospitalRoomFacilitiesBrowse_MasterDetail extends MasterDetailScreen<HospitalRoomFacilities> {
}
