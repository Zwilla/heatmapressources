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

@NamePattern("%s|stateProvinceDistrictName")
@Table(name = "HEATMAPRESSOURCES_STATE_PROVINCE_DISTRICT")
@Entity(name = "heatmapressources_StateProvinceDistrict")
public class StateProvinceDistrict extends StandardEntity {
    private static final long serialVersionUID = 2196335995511162872L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @JoinColumn(name = "COUNTRY_NAME_ID")
    protected Country spd_countryName;

    @NotNull
    @Column(name = "STATE_PROVINCE_DISTRICT_NAME", nullable = false, unique = true)
    protected String stateProvinceDistrictName;

    @Column(name = "DESCRIPTION")
    protected String spd_description;

    @NotNull
    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPD_EMERGENCY_CONTACT_ID")
    protected Humans spd_EmergencyContact;


    public void setSpd_countryName(Country spd_countryName) {
        this.spd_countryName = spd_countryName;
    }


    public Country getSpd_countryName() {
        return spd_countryName;
    }


    public Humans getSpd_EmergencyContact() {
        return spd_EmergencyContact;
    }


    public void setSpd_EmergencyContact(Humans spd_EmergencyContact) {
        this.spd_EmergencyContact = spd_EmergencyContact;
    }


    public String getSpd_description() {
        return spd_description;
    }


    public void setSpd_description(String spd_description) {
        this.spd_description = spd_description;
    }


    public String getStateProvinceDistrictName() {
        return stateProvinceDistrictName;
    }


    public void setStateProvinceDistrictName(String stateProvinceDistrictName) {
        this.stateProvinceDistrictName = stateProvinceDistrictName;
    }
}
