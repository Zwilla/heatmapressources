package de.wirvsvirus.heatmapressources.web.screens.things;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.Things;

@UiController("heatmapressources_Things.browse")
@UiDescriptor("things-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ThingsBrowse extends MasterDetailScreen<Things> {
}
