package de.wirvsvirus.heatmapressources.web.screens.medicalprofessionals;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.humanresources.MedicalProfessionals;

@UiController("heatmapressources_MedicalProfessionals.browse")
@UiDescriptor("medical-professionals-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class MedicalProfessionalsBrowse_MasterDetail extends MasterDetailScreen<MedicalProfessionals> {
}
