package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import de.wirvsvirus.heatmapressources.entity.hospital.HospitalContacts;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_CONTACTS")
@Entity(name = "heatmapressources_Contacts")
public class Contacts extends StandardEntity {
    private static final long serialVersionUID = 3623122980034282293L;

    @NotNull
    @Column(name = "CONTACT_NAME", nullable = false)
    protected String contactName;

    @Email
    @Column(name = "CONTACT_EMAIL")
    protected String contactEmail;

    @Column(name = "CONTACT_PHONE_NUMBER")
    protected String contactPhoneNumber;

    @Column(name = "CONTACT_WEBSITE")
    protected String contactWebsite;

    @Column(name = "CONTACT_DATA_SOURCES")
    protected String contactDataSources;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HOSPITAL_NAME_ID")
    protected HospitalContacts hospitalName;


    public HospitalContacts getHospitalName() {
        return hospitalName;
    }


    public void setHospitalName(HospitalContacts hospitalName) {
        this.hospitalName = hospitalName;
    }


    public String getContactDataSources() {
        return contactDataSources;
    }


    public void setContactDataSources(String contactDataSources) {
        this.contactDataSources = contactDataSources;
    }


    public String getContactWebsite() {
        return contactWebsite;
    }


    public void setContactWebsite(String contactWebsite) {
        this.contactWebsite = contactWebsite;
    }


    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }


    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }


    public String getContactEmail() {
        return contactEmail;
    }


    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public String getContactName() {
        return contactName;
    }


    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
