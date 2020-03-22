package de.wirvsvirus.heatmapressources.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.Country;

@UiController("heatmapressources_Country.browse")
@UiDescriptor("country-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse_MasterDetail extends MasterDetailScreen<Country> {
}
