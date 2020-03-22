package de.wirvsvirus.heatmapressources.web.screens.contacts;

import com.haulmont.cuba.gui.screen.*;
import de.wirvsvirus.heatmapressources.entity.hospital.Contacts;

@UiController("heatmapressources_Contacts.browse")
@UiDescriptor("contacts-browse_masterDetail.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ContactsBrowse_masterDetail extends MasterDetailScreen<Contacts> {
}
