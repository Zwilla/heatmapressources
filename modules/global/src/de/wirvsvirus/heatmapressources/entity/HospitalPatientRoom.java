package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL_PATIENT_ROOM")
@Entity(name = "heatmapressources_HospitalPatientRoom")
public class HospitalPatientRoom extends StandardEntity {
    private static final long serialVersionUID = -8261333928966918016L;

    @NotNull
    @Column(name = "HOSPITAL_ROOM_LOCATION_NUMDER", nullable = false)
    protected String hospitalRoomLocationNumder;

    @Column(name = "DESCRIPTION")
    protected String description;


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
