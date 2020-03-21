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
@Table(name = "HEATMAPRESSOURCES_CITY_TOWN")
@Entity(name = "heatmapressources_CityTown")
public class CityTown extends StandardEntity {
    private static final long serialVersionUID = -3066179532534108951L;

    @NotNull
    @Column(name = "CITY_NAME", nullable = false)
    protected String cityName;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_PROVINCE_DISTRICT_NAME_ID")
    protected StateProvinceDistrict stateProvinceDistrictName;


    public StateProvinceDistrict getStateProvinceDistrictName() {
        return stateProvinceDistrictName;
    }


    public void setStateProvinceDistrictName(StateProvinceDistrict stateProvinceDistrictName) {
        this.stateProvinceDistrictName = stateProvinceDistrictName;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getCityName() {
        return cityName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
