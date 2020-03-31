package de.wirvsvirus.heatmapressources.web.screens.stateprovincedistrict;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.StateProvinceDistrict;

@UiController("heatmapressources_StateProvinceDistrict_single.browse")
@UiDescriptor("state-province-district-browse.xml")
@LookupComponent("stateProvinceDistrictsTable")
@LoadDataBeforeShow
public class StateProvinceDistrictBrowse extends StandardLookup<StateProvinceDistrict> {
}
