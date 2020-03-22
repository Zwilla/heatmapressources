package de.wirvsvirus.heatmapressources.web.screens.abmulance;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.emergencytransportation.Abmulance;

@UiController("heatmapressources_Abmulance.browse")
@UiDescriptor("abmulance-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class AbmulanceBrowse_masterDetail extends MasterDetailScreen<Abmulance> {
}
