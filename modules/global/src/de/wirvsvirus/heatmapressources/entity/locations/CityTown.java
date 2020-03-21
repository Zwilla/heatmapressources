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

    @NotNull
    @Column(name = "CITY_NAME", nullable = false)
    protected String ct_Name;

    @NotNull
    @Column(name = "CT_ZIP_CODE", nullable = false)
    protected String ct_ZipCode;

    @Column(name = "CT_EMERGENCY_CONTACT")
    protected String ct_Emergency_Contact;

    @Column(name = "DESCRIPTION")
    protected String ct_description;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_PROVINCE_DISTRICT_NAME_ID")
    protected StateProvinceDistrict ct_stateProvinceDistrictName;


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
