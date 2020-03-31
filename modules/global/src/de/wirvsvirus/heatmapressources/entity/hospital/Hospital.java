package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|h_Name")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL")
@Entity(name = "heatmapressources_Hospital")
public class Hospital extends StandardEntity {
    private static final long serialVersionUID = -4041177584120992422L;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "H_CONTROL_CENTER_ID")
    protected ControlCenter h_ControlCenter;

    @Column(name = "H_LOCATION_UUID")
    protected String h_location_uuid;

    @Lob
    @Column(name = "H_ADDRESS")
    protected String h_address;

    @NotNull
    @Column(name = "H_NAME", nullable = false)
    protected String h_Name;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "H_LOCATION")
    protected Point h_location;

    @NotNull
    @Column(name = "H_MAX_ROOMS", nullable = false)
    protected Integer h_maxRooms;

    @NotNull
    @Column(name = "H_ROOMS_WITH_RESPIRATORY_VENTILATOR", nullable = false)
    protected Integer h_Rooms_With_RespiratoryVentilator;

    @Column(name = "H_ROOMS_WITH_RESPIRATORY_VENTILATOR_FREE")
    protected Integer h_Rooms_With_RespiratoryVentilator_Free;

    @Column(name = "H_INTENSIVE_CARE_UNITS")
    protected Integer h_IntensiveCareUnits;

    @NotNull
    @Column(name = "H_DESCRIPTION", nullable = false)
    protected String h_description;


    public void setH_ControlCenter(ControlCenter h_ControlCenter) {
        this.h_ControlCenter = h_ControlCenter;
    }


    public ControlCenter getH_ControlCenter() {
        return h_ControlCenter;
    }


    public String getH_location_uuid() {
        return h_location_uuid;
    }


    public void setH_location_uuid(String h_location_uuid) {
        this.h_location_uuid = h_location_uuid;
    }


    public String getH_address() {
        return h_address;
    }


    public void setH_address(String h_address) {
        this.h_address = h_address;
    }


    public Point getH_location() {
        return h_location;
    }


    public void setH_location(Point h_location) {
        this.h_location = h_location;
    }


    public Integer getH_IntensiveCareUnits() {
        return h_IntensiveCareUnits;
    }


    public void setH_IntensiveCareUnits(Integer h_IntensiveCareUnits) {
        this.h_IntensiveCareUnits = h_IntensiveCareUnits;
    }


    public Integer getH_Rooms_With_RespiratoryVentilator_Free() {
        return h_Rooms_With_RespiratoryVentilator_Free;
    }


    public Integer getH_Rooms_With_RespiratoryVentilator() {
        return h_Rooms_With_RespiratoryVentilator;
    }


    public void setH_Rooms_With_RespiratoryVentilator(Integer h_Rooms_With_RespiratoryVentilator) {
        this.h_Rooms_With_RespiratoryVentilator = h_Rooms_With_RespiratoryVentilator;
    }


    public Integer getH_maxRooms() {
        return h_maxRooms;
    }


    public void setH_maxRooms(Integer h_maxRooms) {
        this.h_maxRooms = h_maxRooms;
    }


    public String getH_description() {
        return h_description;
    }


    public void setH_description(String h_description) {
        this.h_description = h_description;
    }


    public String getH_Name() {
        return h_Name;
    }


    public void setH_Name(String h_Name) {
        this.h_Name = h_Name;
    }
}
