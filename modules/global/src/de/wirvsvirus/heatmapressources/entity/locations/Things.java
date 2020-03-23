package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|things_Name")
@Table(name = "HEATMAPRESSOURCES_THINGS")
@Entity(name = "heatmapressources_Things")
public class Things extends StandardEntity {
    private static final long serialVersionUID = 8575504353446194779L;

    @NotNull
    @Column(name = "THINGS_NAME", nullable = false)
    protected String things_Name;

    @Column(name = "THINGS_UUID")
    protected String things_UUID;

    @Column(name = "THINGS_UUID_TRACKING")
    protected String things_UUID_Tracking;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "THINGS_LOCATION")
    protected Point things_location;

    @NotNull
    @Column(name = "THINGS_TRACKING_SOURCE", nullable = false, length = 512)
    protected String things_TrackingSource;

    @Column(name = "THINGS_TRACKING_LOCATION_API", length = 512)
    protected String things_TrackingLocation_API;

    @Column(name = "THINGS_KIND")
    protected String things_Kind;


    public String getThings_UUID_Tracking() {
        return things_UUID_Tracking;
    }


    public void setThings_UUID_Tracking(String things_UUID_Tracking) {
        this.things_UUID_Tracking = things_UUID_Tracking;
    }


    public String getThings_UUID() {
        return things_UUID;
    }


    public void setThings_UUID(String things_UUID) {
        this.things_UUID = things_UUID;
    }


    public String getThings_Kind() {
        return things_Kind;
    }


    public void setThings_Kind(String things_Kind) {
        this.things_Kind = things_Kind;
    }


    public String getThings_TrackingLocation_API() {
        return things_TrackingLocation_API;
    }


    public void setThings_TrackingLocation_API(String things_TrackingLocation_API) {
        this.things_TrackingLocation_API = things_TrackingLocation_API;
    }


    public String getThings_TrackingSource() {
        return things_TrackingSource;
    }


    public void setThings_TrackingSource(String things_TrackingSource) {
        this.things_TrackingSource = things_TrackingSource;
    }


    public Point getThings_location() {
        return things_location;
    }


    public void setThings_location(Point things_location) {
        this.things_location = things_location;
    }


    public String getThings_Name() {
        return things_Name;
    }


    public void setThings_Name(String things_Name) {
        this.things_Name = things_Name;
    }
}
