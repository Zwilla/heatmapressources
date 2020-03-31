package de.wirvsvirus.heatmapressources.entity.controlcenter;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import de.wirvsvirus.heatmapressources.entity.locations.CityTown;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|cc_Name")
@Table(name = "HEATMAPRESSOURCES_CONTROL_CENTER")
@Entity(name = "heatmapressources_ControlCenter")
public class ControlCenter extends StandardEntity {
    private static final long serialVersionUID = 190969688693029718L;

    @NotNull
    @Column(name = "CC_NAME", nullable = false)
    protected String cc_Name;

    @NotNull
    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint", mandatory = true)
    @Column(name = "CC_LOCATION", nullable = false)
    protected Point cc_location;

    @Column(name = "CC_CONTACT")
    protected String cc_Contact;

    @Column(name = "CC_MAIN_TRACKING_SOURCES", length = 512)
    protected String cc_MainTrackingSources;

    @Transient
    @MetaProperty
    protected List<CityTown> cc_City;


    public void setCc_City(List<CityTown> cc_City) {
        this.cc_City = cc_City;
    }


    public List<CityTown> getCc_City() {
        return cc_City;
    }


    public Point getCc_location() {
        return cc_location;
    }


    public void setCc_location(Point cc_location) {
        this.cc_location = cc_location;
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


    public String getCc_Name() {
        return cc_Name;
    }


    public void setCc_Name(String cc_Name) {
        this.cc_Name = cc_Name;
    }
}
