package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL")
@Entity(name = "heatmapressources_Hospital")
public class Hospital extends StandardEntity {
    private static final long serialVersionUID = -4041177584120992422L;

    @NotNull
    @Column(name = "HOSPITAL_NAME", nullable = false)
    protected String hospitalName;

    @NotNull
    @Column(name = "H_MAX_ROOMS", nullable = false)
    protected Integer h_maxRooms;

    @NotNull
    @Column(name = "H_ROOMS_WITH_RESPIRATORY_VENTILATOR", nullable = false)
    protected Integer h_Rooms_With_RespiratoryVentilator;

    @Column(name = "H_ROOMS_WITH_RESPIRATORY_VENTILATOR_FREE")
    protected Integer h_Rooms_With_RespiratoryVentilator_Free;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


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
