package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Table(name = "HEATMAPRESSOURCES_PATIENTS")
@Entity(name = "heatmapressources_Patients")
public class Patients extends StandardEntity {
    private static final long serialVersionUID = 6342251854696582549L;

    @NotNull
    @Column(name = "PATIENT_NUMBER", nullable = false, unique = true)
    protected UUID patient_Number;

    @Column(name = "PATIENT_UNIQUE_IDENTITY_NUMBER")
    protected String patient_UniqueIdentityNumber;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "PATIENT_BIRTH_DAY", nullable = false)
    protected Date patient_BirthDay;

    @NotNull
    @Column(name = "PATIENT_EMERGENCY_CONTACT", nullable = false)
    protected String patient_EmergencyContact;

    @NotNull
    @Column(name = "PATIENT_LAST_NAME", nullable = false)
    protected String patient_LastName;

    @NotNull
    @Column(name = "PATIENT_FRIST_NAME", nullable = false)
    protected String patient_FristName;


    public String getPatient_EmergencyContact() {
        return patient_EmergencyContact;
    }


    public void setPatient_EmergencyContact(String patient_EmergencyContact) {
        this.patient_EmergencyContact = patient_EmergencyContact;
    }


    public Date getPatient_BirthDay() {
        return patient_BirthDay;
    }


    public void setPatient_BirthDay(Date patient_BirthDay) {
        this.patient_BirthDay = patient_BirthDay;
    }


    public void setPatient_Number(UUID patient_Number) {
        this.patient_Number = patient_Number;
    }


    public UUID getPatient_Number() {
        return patient_Number;
    }


    public String getPatient_UniqueIdentityNumber() {
        return patient_UniqueIdentityNumber;
    }


    public void setPatient_UniqueIdentityNumber(String patient_UniqueIdentityNumber) {
        this.patient_UniqueIdentityNumber = patient_UniqueIdentityNumber;
    }


    public String getPatient_FristName() {
        return patient_FristName;
    }


    public void setPatient_FristName(String patient_FristName) {
        this.patient_FristName = patient_FristName;
    }


    public String getPatient_LastName() {
        return patient_LastName;
    }


    public void setPatient_LastName(String patient_LastName) {
        this.patient_LastName = patient_LastName;
    }


}
