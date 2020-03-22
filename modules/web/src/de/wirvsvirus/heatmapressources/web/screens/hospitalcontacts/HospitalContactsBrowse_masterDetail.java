package de.wirvsvirus.heatmapressources.web.screens.hospitalcontacts;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.HospitalContacts;

@UiController("heatmapressources_HospitalContacts.browse")
@UiDescriptor("hospital-contacts-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HospitalContactsBrowse_masterDetail extends MasterDetailScreen<HospitalContacts> {
}
