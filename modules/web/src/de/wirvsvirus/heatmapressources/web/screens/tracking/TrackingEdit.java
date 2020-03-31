package de.wirvsvirus.heatmapressources.web.screens.tracking;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.tracking_sources.Tracking;

@UiController("heatmapressources_Tracking.edit")
@UiDescriptor("tracking-edit.xml")
@EditedEntityContainer("trackingDc")
@LoadDataBeforeShow
public class TrackingEdit extends StandardEditor<Tracking> {
}
