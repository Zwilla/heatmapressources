package de.wirvsvirus.heatmapressources.web.screens.stateprovincedistrict;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.StateProvinceDistrict;

@UiController("heatmapressources_StateProvinceDistrict.edit")
@UiDescriptor("state-province-district-edit.xml")
@EditedEntityContainer("stateProvinceDistrictDc")
@LoadDataBeforeShow
public class StateProvinceDistrictEdit extends StandardEditor<StateProvinceDistrict> {
}
