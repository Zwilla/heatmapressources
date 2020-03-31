package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|hrf_Name")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES")
@Entity(name = "heatmapressources_HospitalRoomFacilities")
public class HospitalRoomFacilities extends StandardEntity {
    private static final long serialVersionUID = -1424071497676038327L;

    @NotNull
    @Column(name = "HRF_NAME", nullable = false, unique = true)
    protected String hrf_Name;

    @NotNull
    @Column(name = "INTENSIVE_CARE_BEDS_NUMBER", nullable = false)
    protected Integer intensiveCareBedsNumber;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RV_RESPIRATORY_VENTILATOR_ID")
    protected RespiratoryVentilator rv_RespiratoryVentilator;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HRF_LOCATION_TRACKING")
    protected Point hrf_location_tracking;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HRF_LOCATION_TRACKING_SOURCE")
    protected Point hrf_location_tracking_source;

    @Column(name = "DSECRIPTION")
    protected String description;


    public String getHrf_Name() {
        return hrf_Name;
    }


    public void setHrf_Name(String hrf_Name) {
        this.hrf_Name = hrf_Name;
    }


    public void setHrf_location_tracking(Point hrf_location_tracking) {
        this.hrf_location_tracking = hrf_location_tracking;
    }


    public Point getHrf_location_tracking() {
        return hrf_location_tracking;
    }


    public Point getHrf_location_tracking_source() {
        return hrf_location_tracking_source;
    }


    public void setHrf_location_tracking_source(Point hrf_location_tracking_source) {
        this.hrf_location_tracking_source = hrf_location_tracking_source;
    }


    public RespiratoryVentilator getRv_RespiratoryVentilator() {
        return rv_RespiratoryVentilator;
    }


    public void setRv_RespiratoryVentilator(RespiratoryVentilator rv_RespiratoryVentilator) {
        this.rv_RespiratoryVentilator = rv_RespiratoryVentilator;
    }


    public Integer getIntensiveCareBedsNumber() {
        return intensiveCareBedsNumber;
    }


    public void setIntensiveCareBedsNumber(Integer intensiveCareBedsNumber) {
        this.intensiveCareBedsNumber = intensiveCareBedsNumber;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
