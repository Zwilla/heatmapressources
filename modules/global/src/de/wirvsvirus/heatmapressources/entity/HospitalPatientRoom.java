package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM")
@Entity(name = "heatmapressources_HospitalPatientRoom")
public class HospitalPatientRoom extends StandardEntity {
    private static final long serialVersionUID = -8261333928966918016L;

    @NotNull
    @Column(name = "HOSPITAL_ROOM_LOCATION_NUMDER", nullable = false)
    protected String hospitalRoomLocationNumder;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HOSPITAL_PATIENT_ROOM_ID")
    protected HospitalPatientRoom hospital_PatientRoom;

    @NotNull(message = "{msg://heatmapressources_HospitalPatientRoom.hpr_intensiveCareRoomNumber.validation.NotNull}")
    @Column(name = "HPR_INTENSIVE_CARE_ROOM_NUMBER", nullable = false)
    protected Boolean hpr_intensiveCareRoom = false;

    @NotNull
    @Column(name = "HPR_RESPIRATORY_VENTILATOR", nullable = false)
    protected Boolean hpr_RespiratoryVentilator = false;

    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


    public void setHpr_intensiveCareRoom(Boolean hpr_intensiveCareRoom) {
        this.hpr_intensiveCareRoom = hpr_intensiveCareRoom;
    }


    public Boolean getHpr_intensiveCareRoom() {
        return hpr_intensiveCareRoom;
    }


    public Boolean getHpr_RespiratoryVentilator() {
        return hpr_RespiratoryVentilator;
    }


    public void setHpr_RespiratoryVentilator(Boolean hpr_RespiratoryVentilator) {
        this.hpr_RespiratoryVentilator = hpr_RespiratoryVentilator;
    }


    public HospitalPatientRoom getHospital_PatientRoom() {
        return hospital_PatientRoom;
    }


    public void setHospital_PatientRoom(HospitalPatientRoom hospital_PatientRoom) {
        this.hospital_PatientRoom = hospital_PatientRoom;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getHospitalRoomLocationNumder() {
        return hospitalRoomLocationNumder;
    }


    public void setHospitalRoomLocationNumder(String hospitalRoomLocationNumder) {
        this.hospitalRoomLocationNumder = hospitalRoomLocationNumder;
    }
}
