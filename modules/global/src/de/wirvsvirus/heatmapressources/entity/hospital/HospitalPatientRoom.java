package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|hospital_PatientRoom")
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
    protected Hospital hospital_PatientRoom;

    @NotNull(message = "{msg://heatmapressources_HospitalPatientRoom.hpr_intensiveCareRoomNumber.validation.NotNull}")
    @Column(name = "HPR_INTENSIVE_CARE_ROOM_NUMBER", nullable = false)
    protected Boolean hpr_intensiveCareRoom = false;

    @NotNull
    @Column(name = "HPR_RESPIRATORY_VENTILATOR", nullable = false)
    protected Boolean hpr_RespiratoryVentilator = false;

    @Lob
    @Column(name = "HPR_RESSOURCES")
    protected String hpr_ressources;

    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


    public void setHospital_PatientRoom(Hospital hospital_PatientRoom) {
        this.hospital_PatientRoom = hospital_PatientRoom;
    }


    public Hospital getHospital_PatientRoom() {
        return hospital_PatientRoom;
    }


    public String getHpr_ressources() {
        return hpr_ressources;
    }


    public void setHpr_ressources(String hpr_ressources) {
        this.hpr_ressources = hpr_ressources;
    }


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
