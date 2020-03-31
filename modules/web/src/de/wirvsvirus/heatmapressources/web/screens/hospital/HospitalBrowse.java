package de.wirvsvirus.heatmapressources.web.screens.hospital;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.Hospital;

@UiController("heatmapressources_Hospital.browse")
@UiDescriptor("hospital-browse.xml")
@LookupComponent("hospitalsTable")
@LoadDataBeforeShow
public class HospitalBrowse extends StandardLookup<Hospital> {
}
