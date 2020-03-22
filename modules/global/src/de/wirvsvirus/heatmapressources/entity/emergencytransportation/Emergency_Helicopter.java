package de.wirvsvirus.heatmapressources.entity.emergencytransportation;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_EMERGENCY_HELICOPTER")
@Entity(name = "heatmapressources_Emergency_Helicopter")
public class Emergency_Helicopter extends StandardEntity {
    private static final long serialVersionUID = 4917347614501063430L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EH_CONTROL_CENTER_ID")
    protected ControlCenter eh_ControlCenter;

    @NotNull
    @Column(name = "EH_EMERGENCY_HELICOPTER_UUID", nullable = false, unique = true)
    protected String eh_Emergency_Helicopter_UUID;

    @NotNull
    @MetaProperty(datatype = "GeoPoint", mandatory = true)
    @Column(name = "EH_LOCATION_HOME", nullable = false)
    protected Point eh_location_home;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "EH_LOCATION_TRACKING")
    protected Point eh_location_tracking;

    @Column(name = "EH_TRACKING_SOURCE", length = 512)
    protected String eh_location_tracking_source;

    @NotNull
    @Column(name = "EH_CONTACT", nullable = false)
    protected String eh_contact;


    public String getEh_location_tracking_source() {
        return eh_location_tracking_source;
    }


    public void setEh_location_tracking_source(String eh_location_tracking_source) {
        this.eh_location_tracking_source = eh_location_tracking_source;
    }


    public ControlCenter getEh_ControlCenter() {
        return eh_ControlCenter;
    }


    public void setEh_ControlCenter(ControlCenter eh_ControlCenter) {
        this.eh_ControlCenter = eh_ControlCenter;
    }


    public String getEh_contact() {
        return eh_contact;
    }


    public void setEh_contact(String eh_contact) {
        this.eh_contact = eh_contact;
    }


    public Point getEh_location_tracking() {
        return eh_location_tracking;
    }


    public void setEh_location_tracking(Point eh_location_tracking) {
        this.eh_location_tracking = eh_location_tracking;
    }


    public Point getEh_location_home() {
        return eh_location_home;
    }


    public void setEh_location_home(Point eh_location_home) {
        this.eh_location_home = eh_location_home;
    }


    public String getEh_Emergency_Helicopter_UUID() {
        return eh_Emergency_Helicopter_UUID;
    }


    public void setEh_Emergency_Helicopter_UUID(String eh_Emergency_Helicopter_UUID) {
        this.eh_Emergency_Helicopter_UUID = eh_Emergency_Helicopter_UUID;
    }
}
