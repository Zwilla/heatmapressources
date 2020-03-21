package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES")
@Entity(name = "heatmapressources_HospitalRoomFacilities")
public class HospitalRoomFacilities extends StandardEntity {
    private static final long serialVersionUID = -1424071497676038327L;

    @NotNull
    @Column(name = "INTENSIVE_CARE_BEDS_NUMBER", nullable = false)
    protected Integer intensiveCareBedsNumber;

    @Column(name = "DSECRIPTION")
    protected String description;

    @Column(name = "HRF_RESPIRATORY_VENTILATOR")
    protected String hrf_RespiratoryVentilator;

    @NotNull
    @Column(name = "HRF_RESPIRATORY_VENTILATOR_PORTABLE", nullable = false)
    protected Boolean hrf_RespiratoryVentilatorPortable = false;

    @NotNull
    @Column(name = "HRF_RESPIRATORY_VENTILATOR_MAX_PATIENTS", nullable = false)
    protected Integer hrf_RespiratoryVentilatorMaxPatients;


    public Integer getHrf_RespiratoryVentilatorMaxPatients() {
        return hrf_RespiratoryVentilatorMaxPatients;
    }


    public void setHrf_RespiratoryVentilatorMaxPatients(Integer hrf_RespiratoryVentilatorMaxPatients) {
        this.hrf_RespiratoryVentilatorMaxPatients = hrf_RespiratoryVentilatorMaxPatients;
    }


    public Boolean getHrf_RespiratoryVentilatorPortable() {
        return hrf_RespiratoryVentilatorPortable;
    }


    public void setHrf_RespiratoryVentilatorPortable(Boolean hrf_RespiratoryVentilatorPortable) {
        this.hrf_RespiratoryVentilatorPortable = hrf_RespiratoryVentilatorPortable;
    }


    public String getHrf_RespiratoryVentilator() {
        return hrf_RespiratoryVentilator;
    }


    public void setHrf_RespiratoryVentilator(String hrf_RespiratoryVentilator) {
        this.hrf_RespiratoryVentilator = hrf_RespiratoryVentilator;
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
