package de.wirvsvirus.heatmapressources.web.screens.hospitalpatientroom;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.HospitalPatientRoom;

@UiController("heatmapressources_HospitalPatientRoom.browse")
@UiDescriptor("hospital-patient-room-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HospitalPatientRoomBrowse_masterDetail extends MasterDetailScreen<HospitalPatientRoom> {
}
