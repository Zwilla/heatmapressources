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

    @NotNull
    @Column(name = "C_EMERGENCY_WEBSITE", nullable = false, length = 512)
    protected String c_EmergencyWebsite;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "C_LOCATION")
    protected Point c_location;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open"})
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_EMERGENCY_CONTACT_ID")
    protected Humans c_EmergencyContact;


    public Point getC_location() {
        return c_location;
    }


    public void setC_location(Point c_location) {
        this.c_location = c_location;
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
