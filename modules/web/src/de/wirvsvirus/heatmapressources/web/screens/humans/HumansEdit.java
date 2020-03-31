package de.wirvsvirus.heatmapressources.web.screens.humans;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;

@UiController("heatmapressources_Humans.edit")
@UiDescriptor("humans-edit.xml")
@EditedEntityContainer("humansDc")
@LoadDataBeforeShow
public class HumansEdit extends StandardEditor<Humans> {
}
