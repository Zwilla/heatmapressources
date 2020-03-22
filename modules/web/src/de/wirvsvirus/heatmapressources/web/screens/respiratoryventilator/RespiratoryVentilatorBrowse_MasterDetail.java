package de.wirvsvirus.heatmapressources.web.screens.respiratoryventilator;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.RespiratoryVentilator;

@UiController("heatmapressources_RespiratoryVentilator.browse")
@UiDescriptor("respiratory-ventilator-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RespiratoryVentilatorBrowse_MasterDetail extends MasterDetailScreen<RespiratoryVentilator> {
}
