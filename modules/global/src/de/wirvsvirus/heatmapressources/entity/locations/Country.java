package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.*;
import com.haulmont.cuba.core.global.DeletePolicy;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
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

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_EMERGENCY_CONTACT_ID")
    protected Humans c_EmergencyContact;

    @NotNull
    @Column(name = "C_EMERGENCY_WEBSITE", nullable = false, length = 512)
    protected String c_EmergencyWebsite;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "LOCATION")
    protected Point location;


    public Point getLocation() {
        return location;
    }


    public void setLocation(Point location) {
        this.location = location;
    }


    public String getC_EmergencyWebsite() {
        return c_EmergencyWebsite;
    }


    public void setC_EmergencyWebsite(String c_EmergencyWebsite) {
        this.c_EmergencyWebsite = c_EmergencyWebsite;
    }


    public Humans getC_EmergencyContact() {
        return c_EmergencyContact;
    }


    public void setC_EmergencyContact(Humans c_EmergencyContact) {
        this.c_EmergencyContact = c_EmergencyContact;
    }


    public String getCountryName() {
        return countryName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
