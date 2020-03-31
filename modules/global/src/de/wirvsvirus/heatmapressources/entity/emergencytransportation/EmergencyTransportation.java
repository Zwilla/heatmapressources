package de.wirvsvirus.heatmapressources.entity.emergencytransportation;

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
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|et_Name")
@Table(name = "HEATMAPRESSOURCES_EMERGENCY_TRANSPORTATION")
@Entity(name = "heatmapressources_EmergencyTransportation")
public class EmergencyTransportation extends StandardEntity {
    private static final long serialVersionUID = 4436786865647325428L;

    @NotNull
    @Column(name = "ET_NAME", nullable = false, unique = true)
    protected String et_Name;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ET_CONTROL_CENTER_ID")
    protected ControlCenter et_ControlCenter;

    @Column(name = "ET_AMBULANCE_UUID", length = 512)
    protected String et_Ambulance_UUID;

    @Column(name = "ET_EMERGENCY_HELICOPTER", length = 512)
    protected String et_Emergency_Helicopter;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "ET_LOCATION")
    protected Point et_location;

    @Column(name = "ET_TRACKING_SOURCE", length = 512)
    protected String et_tracking_source;


    public String getEt_Name() {
        return et_Name;
    }


    public void setEt_Name(String et_Name) {
        this.et_Name = et_Name;
    }


    public ControlCenter getEt_ControlCenter() {
        return et_ControlCenter;
    }


    public void setEt_ControlCenter(ControlCenter et_ControlCenter) {
        this.et_ControlCenter = et_ControlCenter;
    }


    public String getEt_tracking_source() {
        return et_tracking_source;
    }


    public void setEt_tracking_source(String et_tracking_source) {
        this.et_tracking_source = et_tracking_source;
    }


    public Point getEt_location() {
        return et_location;
    }


    public void setEt_location(Point et_location) {
        this.et_location = et_location;
    }


    public String getEt_Emergency_Helicopter() {
        return et_Emergency_Helicopter;
    }


    public void setEt_Emergency_Helicopter(String et_Emergency_Helicopter) {
        this.et_Emergency_Helicopter = et_Emergency_Helicopter;
    }


    public String getEt_Ambulance_UUID() {
        return et_Ambulance_UUID;
    }


    public void setEt_Ambulance_UUID(String et_Ambulance_UUID) {
        this.et_Ambulance_UUID = et_Ambulance_UUID;
    }
}
