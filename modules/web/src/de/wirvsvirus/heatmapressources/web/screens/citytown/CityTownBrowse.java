package de.wirvsvirus.heatmapressources.web.screens.citytown;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("heatmapressources_CityTown.browse")
@UiDescriptor("city-town-browse.xml")
@LookupComponent("cityTownsTable")
@LoadDataBeforeShow
public class CityTownBrowse extends StandardLookup<CityTown> {

}
