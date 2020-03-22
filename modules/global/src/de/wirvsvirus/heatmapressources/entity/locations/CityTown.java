package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ct_description")
@Table(name = "HEATMAPRESSOURCES_CITY_TOWN")
@Entity(name = "heatmapressources_CityTown")
public class CityTown extends StandardEntity {
    private static final long serialVersionUID = -3066179532534108951L;

    @Lookup(type = LookupType.SCREEN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CT_COUNTRY_ID")
    protected Country ct_Country;

    @NotNull
    @Column(name = "CITY_NAME", nullable = false)
    protected String ct_Name;

    @Column(name = "DESCRIPTION")
    protected String ct_description;

    @NotNull
    @Column(name = "CT_ZIP_CODE", nullable = false)
    protected String ct_ZipCode;

    @Column(name = "CT_EMERGENCY_CONTACT")
    protected String ct_Emergency_Contact;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_PROVINCE_DISTRICT_NAME_ID")
    protected StateProvinceDistrict ct_stateProvinceDistrictName;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CT_EMERGENCY_CONTACT_ID")
    protected Humans ct_EmergencyContact;


    public Country getCt_Country() {
        return ct_Country;
    }


    public void setCt_Country(Country ct_Country) {
        this.ct_Country = ct_Country;
    }


    public Humans getCt_EmergencyContact() {
        return ct_EmergencyContact;
    }


    public void setCt_EmergencyContact(Humans ct_EmergencyContact) {
        this.ct_EmergencyContact = ct_EmergencyContact;
    }


    public String getCt_Emergency_Contact() {
        return ct_Emergency_Contact;
    }


    public void setCt_Emergency_Contact(String ct_Emergency_Contact) {
        this.ct_Emergency_Contact = ct_Emergency_Contact;
    }


    public String getCt_ZipCode() {
        return ct_ZipCode;
    }


    public void setCt_ZipCode(String ct_ZipCode) {
        this.ct_ZipCode = ct_ZipCode;
    }


    public StateProvinceDistrict getCt_stateProvinceDistrictName() {
        return ct_stateProvinceDistrictName;
    }


    public void setCt_stateProvinceDistrictName(StateProvinceDistrict ct_stateProvinceDistrictName) {
        this.ct_stateProvinceDistrictName = ct_stateProvinceDistrictName;
    }


    public String getCt_description() {
        return ct_description;
    }


    public void setCt_description(String ct_description) {
        this.ct_description = ct_description;
    }


    public String getCt_Name() {
        return ct_Name;
    }


    public void setCt_Name(String ct_Name) {
        this.ct_Name = ct_Name;
    }
}
