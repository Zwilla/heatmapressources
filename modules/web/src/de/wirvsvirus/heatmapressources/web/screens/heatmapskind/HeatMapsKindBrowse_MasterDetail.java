package de.wirvsvirus.heatmapressources.web.screens.heatmapskind;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.heatmaps.HeatMapsKind;

@UiController("heatmapressources_HeatMapsKind.browse")
@UiDescriptor("heat-maps-kind-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HeatMapsKindBrowse_MasterDetail extends MasterDetailScreen<HeatMapsKind> {
}
