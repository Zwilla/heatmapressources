package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_HEAT_MAPS_ALL")
@Entity(name = "heatmapressources_HeatMaps_All")
public class HeatMaps_Global extends StandardEntity {
    private static final long serialVersionUID = -2170023470367533752L;

    @NotNull
    @Column(name = "HEAT_MAPS_NAME", nullable = false)
    protected String heatMaps_Name;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HEAT_MAPS_KIND_ID")
    protected HeatMapsKind heatMaps_Kind;

    @Column(name = "HEAT_MAPS_WEBSITE")
    protected String heatMaps_Website;

    @Column(name = "HEAT_MAPS_CONTACT_WEBSITE_OR_EMAIL")
    protected String heatMaps_Contact_WebsiteOrEmail;

    @Column(name = "HEAT_MAPS_DATA_SOURCES")
    protected String heatMaps_DataSources;


    public String getHeatMaps_DataSources() {
        return heatMaps_DataSources;
    }


    public void setHeatMaps_DataSources(String heatMaps_DataSources) {
        this.heatMaps_DataSources = heatMaps_DataSources;
    }


    public String getHeatMaps_Contact_WebsiteOrEmail() {
        return heatMaps_Contact_WebsiteOrEmail;
    }


    public void setHeatMaps_Contact_WebsiteOrEmail(String heatMaps_Contact_WebsiteOrEmail) {
        this.heatMaps_Contact_WebsiteOrEmail = heatMaps_Contact_WebsiteOrEmail;
    }


    public String getHeatMaps_Website() {
        return heatMaps_Website;
    }


    public void setHeatMaps_Website(String heatMaps_Website) {
        this.heatMaps_Website = heatMaps_Website;
    }


    public HeatMapsKind getHeatMaps_Kind() {
        return heatMaps_Kind;
    }


    public void setHeatMaps_Kind(HeatMapsKind heatMaps_Kind) {
        this.heatMaps_Kind = heatMaps_Kind;
    }


    public String getHeatMaps_Kind() {
        return heatMaps_KindName;
    }


    public void setHeatMaps_Kind(String heatMaps_Kind) {
    }


    public String getHeatMaps_Name() {
        return heatMaps_Name;
    }


    public void setHeatMaps_Name(String heatMaps_Name) {
        this.heatMaps_Name = heatMaps_Name;
    }
}
