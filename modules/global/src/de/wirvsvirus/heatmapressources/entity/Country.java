package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|countryName")
@Table(name = "HEATMAPRESSOURCES_COUNTRY")
@Entity(name = "heatmapressources_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 1776906780210386943L;

    @CaseConversion
    @NotNull
    @Column(name = "COUNTRY_NAME", nullable = false, unique = true)
    protected String countryName;


    public String getCountryName() {
        return countryName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
