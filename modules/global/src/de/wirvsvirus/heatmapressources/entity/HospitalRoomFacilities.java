package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_HOSPITAL_ROOM_FACILITIES")
@Entity(name = "heatmapressources_HospitalRoomFacilities")
public class HospitalRoomFacilities extends StandardEntity {
    private static final long serialVersionUID = -1424071497676038327L;

    @NotNull
    @Column(name = "INTENSIVE_CARE_BEDS_NUMBER", nullable = false)
    protected Integer intensiveCareBedsNumber;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RV_RESPIRATORY_VENTILATOR_ID")
    protected RespiratoryVentilator rv_RespiratoryVentilator;

    @Column(name = "DSECRIPTION")
    protected String description;


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
