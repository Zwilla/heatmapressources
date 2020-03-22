package de.wirvsvirus.heatmapressources.web.screens.heatmap_humans5g;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.heatmaps.HeatMap_Humans5G;

@UiController("heatmapressources_HeatMap_Humans5G.browse")
@UiDescriptor("heat-map_humans5g-browse.xml")
@LookupComponent("heatMap_Humans5GsTable")
@LoadDataBeforeShow
public class HeatMap_Humans5GBrowse extends StandardLookup<HeatMap_Humans5G> {
}
