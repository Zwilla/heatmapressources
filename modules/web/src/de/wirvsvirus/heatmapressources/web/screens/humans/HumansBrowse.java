package de.wirvsvirus.heatmapressources.web.screens.humans;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;

@UiController("heatmapressources_Humans.browse")
@UiDescriptor("humans-browse.xml")
@LookupComponent("humansesTable")
@LoadDataBeforeShow
public class HumansBrowse extends StandardLookup<Humans> {
}
