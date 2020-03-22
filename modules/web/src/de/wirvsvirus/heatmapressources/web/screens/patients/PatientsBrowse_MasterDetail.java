package de.wirvsvirus.heatmapressources.web.screens.patients;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.Patients;

@UiController("heatmapressources_Patients.browse")
@UiDescriptor("patients-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class PatientsBrowse_MasterDetail extends MasterDetailScreen<Patients> {
}
