package de.wirvsvirus.heatmapressources.web.screens.country;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.components.mainwindow.AppMenu;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.vaadin.event.ContextClickEvent;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;
import de.wirvsvirus.heatmapressources.entity.locations.Country;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;
import javax.swing.*;
import java.util.Objects;

@UiController("heatmapressources_Country.browse")
@UiDescriptor("country-browse_MasterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse_MasterDetail extends MasterDetailScreen<Country> {

    @Inject
    private Notifications notifications;

    @Inject
    private GeoMap countryMap;
    @Inject
    private InstanceContainer<de.wirvsvirus.heatmapressources.entity.locations.Country> countryDc;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {

        try{
            Point location = Objects.requireNonNull(countryDc.getItemOrNull()).getC_location();
            if (location != null) {
                countryMap.setCenter(location.getX(), location.getY());
            }
        }
        catch (Exception ignored){

        }
    }

    @Inject
    private Button button;

    @Subscribe("someAction")
    protected void onSomeActionActionPerformed(Action.ActionPerformedEvent event) {

        notifications.create()
                .withCaption("Action performed 1")
                .show();
    }

    @Subscribe
    protected void onInit(InitEvent event) {
        button.setAction(new BaseAction("theAction")
                .withCaption("Click Me!")
                .withHandler(actionPerformedEvent ->
                        notifications.create()
                                .withCaption("Action performed 2")
                                .show()));
    }
}

