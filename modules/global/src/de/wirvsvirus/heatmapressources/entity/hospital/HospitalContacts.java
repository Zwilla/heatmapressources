package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL_CONTACTS")
@Entity(name = "heatmapressources_HospitalContacts")
public class HospitalContacts extends StandardEntity {
    private static final long serialVersionUID = -1083098619523556722L;

    @NotNull
    @Column(name = "HOSPITAL_MAIN_CONTACT", nullable = false)
    protected String hospitalMainContact;

    @Column(name = "DESCRIPTION")
    protected String description;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getHospitalMainContact() {
        return hospitalMainContact;
    }


    public void setHospitalMainContact(String hospitalMainContact) {
        this.hospitalMainContact = hospitalMainContact;
    }
}
