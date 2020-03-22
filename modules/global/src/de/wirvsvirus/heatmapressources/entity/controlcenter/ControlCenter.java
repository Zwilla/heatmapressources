package de.wirvsvirus.heatmapressources.entity.controlcenter;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|cc_Name")
@Table(name = "HEATMAPRESSOURCES_CONTROL_CENTER")
@Entity(name = "heatmapressources_ControlCenter")
public class ControlCenter extends StandardEntity {
    private static final long serialVersionUID = 190969688693029718L;

    @NotNull
    @Column(name = "CC_NAME", nullable = false)
    protected String cc_Name;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CC_CITY_ID")
    protected CityTown cc_City;

    @NotNull
    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint", mandatory = true)
    @Column(name = "LOCATION", nullable = false)
    protected Point location;

    @Column(name = "CC_CONTACT")
    protected String cc_Contact;

    @Column(name = "CC_MAIN_TRACKING_SOURCES", length = 512)
    protected String cc_MainTrackingSources;


    public Point getLocation() {
        return location;
    }


    public void setLocation(Point location) {
        this.location = location;
    }


    public String getCc_MainTrackingSources() {
        return cc_MainTrackingSources;
    }


    public void setCc_MainTrackingSources(String cc_MainTrackingSources) {
        this.cc_MainTrackingSources = cc_MainTrackingSources;
    }


    public String getCc_Contact() {
        return cc_Contact;
    }


    public void setCc_Contact(String cc_Contact) {
        this.cc_Contact = cc_Contact;
    }


    public CityTown getCc_City() {
        return cc_City;
    }


    public void setCc_City(CityTown cc_City) {
        this.cc_City = cc_City;
    }


    public String getCc_Name() {
        return cc_Name;
    }


    public void setCc_Name(String cc_Name) {
        this.cc_Name = cc_Name;
    }
}
