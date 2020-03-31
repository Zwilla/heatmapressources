package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|contactName")
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
