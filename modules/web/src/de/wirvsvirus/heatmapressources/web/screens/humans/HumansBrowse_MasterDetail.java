package de.wirvsvirus.heatmapressources.web.screens.humans;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;

@UiController("heatmapressources_Humans.browse")
@UiDescriptor("humans-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HumansBrowse_MasterDetail extends MasterDetailScreen<Humans> {
}
