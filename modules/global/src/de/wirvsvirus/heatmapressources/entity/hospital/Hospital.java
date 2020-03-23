package de.wirvsvirus.heatmapressources.entity.hospital;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;

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

import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|hospitalName")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL")
@Entity(name = "heatmapressources_Hospital")
public class Hospital extends StandardEntity {
    private static final long serialVersionUID = -4041177584120992422L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "H_CONTROL_CENTER_ID")
    protected ControlCenter h_ControlCenter;

    @Lob
    @Column(name = "H_ADDRESS")
    protected String h_address;

    @NotNull
    @Column(name = "HOSPITAL_NAME", nullable = false)
    protected String hospitalName;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "LOCATION")
    protected Point location;

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
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


    public String getH_address() {
        return h_address;
    }


    public void setH_address(String h_address) {
        this.h_address = h_address;
    }


    public ControlCenter getH_ControlCenter() {
        return h_ControlCenter;
    }


    public void setH_ControlCenter(ControlCenter h_ControlCenter) {
        this.h_ControlCenter = h_ControlCenter;
    }


    public Point getLocation() {
        return location;
    }


    public void setLocation(Point location) {
        this.location = location;
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


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getHospitalName() {
        return hospitalName;
    }


    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
