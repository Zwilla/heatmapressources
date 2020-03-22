package de.wirvsvirus.heatmapressources.web.screens.citytown;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;

@UiController("heatmapressources_CityTown.browse")
@UiDescriptor("city-town-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CityTownBrowse_MasterDetail extends MasterDetailScreen<CityTown> {
}
