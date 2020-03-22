package de.wirvsvirus.heatmapressources.web.screens.globalresources;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.tracking_sources.services.GlobalResources;

@UiController("heatmapressources_GlobalResources.browse")
@UiDescriptor("global-resources-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class GlobalResourcesBrowse_MasterDetail extends MasterDetailScreen<GlobalResources> {
}
