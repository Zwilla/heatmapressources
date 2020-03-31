package de.wirvsvirus.heatmapressources.web.screens.tracking;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.tracking_sources.Tracking;

@UiController("heatmapressources_Tracking.browse")
@UiDescriptor("tracking-browse.xml")
@LookupComponent("trackingsTable")
@LoadDataBeforeShow
public class TrackingBrowse extends StandardLookup<Tracking> {
}
