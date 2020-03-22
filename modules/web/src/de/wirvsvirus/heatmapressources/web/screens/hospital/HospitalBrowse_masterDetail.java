package de.wirvsvirus.heatmapressources.web.screens.hospital;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.Hospital;

@UiController("heatmapressources_Hospital.browse")
@UiDescriptor("hospital-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HospitalBrowse_masterDetail extends MasterDetailScreen<Hospital> {
}
