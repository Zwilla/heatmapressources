package de.wirvsvirus.heatmapressources.web.screens.trackingwhat;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.tracking_sources.services.TrackingWhat;

@UiController("heatmapressources_TrackingWhat.browse")
@UiDescriptor("tracking-what-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class TrackingWhatBrowse_MasterDetail extends MasterDetailScreen<TrackingWhat> {
}
