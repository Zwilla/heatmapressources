package de.wirvsvirus.heatmapressources.web.screens.abouttracking;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.tracking_sources.services.AboutTracking;

@UiController("heatmapressources_AboutTracking.browse")
@UiDescriptor("about-tracking-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class AboutTrackingBrowse extends MasterDetailScreen<AboutTracking> {
}
