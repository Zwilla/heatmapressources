package de.wirvsvirus.heatmapressources.web.screens.stateprovincedistrict;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.StateProvinceDistrict;

@UiController("heatmapressources_StateProvinceDistrict.browse")
@UiDescriptor("state-province-district-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class StateProvinceDistrictBrowse_MasterDetail extends MasterDetailScreen<StateProvinceDistrict> {
}
