package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_STATE_PROVINCE_DISTRICT")
@Entity(name = "heatmapressources_StateProvinceDistrict")
public class StateProvinceDistrict extends StandardEntity {
    private static final long serialVersionUID = 2196335995511162872L;

    @NotNull
    @Column(name = "STATE_PROVINCE_DISTRICT_NAME", nullable = false, unique = true)
    protected String stateProvinceDistrictName;

    @Column(name = "DESCRIPTION")
    protected String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @JoinColumn(name = "COUNTRY_NAME_ID")
    protected StateProvinceDistrict countryName;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setCountryName(StateProvinceDistrict countryName) {
        this.countryName = countryName;
    }


    public StateProvinceDistrict getCountryName() {
        return countryName;
    }


    public String getStateProvinceDistrictName() {
        return stateProvinceDistrictName;
    }


    public void setStateProvinceDistrictName(String stateProvinceDistrictName) {
        this.stateProvinceDistrictName = stateProvinceDistrictName;
    }
}
