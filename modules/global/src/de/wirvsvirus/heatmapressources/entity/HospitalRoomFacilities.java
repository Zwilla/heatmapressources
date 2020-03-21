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

    @Column(name = "DSECRIPTION")
    protected String description;

    @NotNull
    @Column(name = "INTENSIVE_CARE_BEDS_NUMBER", nullable = false)
    protected Integer intensiveCareBedsNumber;


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
