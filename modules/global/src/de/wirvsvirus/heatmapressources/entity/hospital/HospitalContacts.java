package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL_CONTACTS")
@Entity(name = "heatmapressources_HospitalContacts")
public class HospitalContacts extends StandardEntity {
    private static final long serialVersionUID = -1083098619523556722L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HC_HOSPITAL_ID")
    protected Hospital hc_Hospital;

    @NotNull
    @Column(name = "HOSPITAL_MAIN_CONTACT", nullable = false)
    protected String hospitalMainContact;

    @NotNull
    @Column(name = "HC_PHONE_NUMBER", nullable = false)
    protected String hc_PhoneNumber;

    @NotNull
    @Column(name = "HC_EMAIL", nullable = false)
    protected String hc_Email;

    @Column(name = "HC_FAXIMILE")
    protected String hc_Faximile;

    @Column(name = "HC_HEAD_OF")
    protected String hc_HeadOf;

    @Column(name = "DESCRIPTION")
    protected String description;


    public Hospital getHc_Hospital() {
        return hc_Hospital;
    }


    public void setHc_Hospital(Hospital hc_Hospital) {
        this.hc_Hospital = hc_Hospital;
    }


    public String getHc_HeadOf() {
        return hc_HeadOf;
    }


    public void setHc_HeadOf(String hc_HeadOf) {
        this.hc_HeadOf = hc_HeadOf;
    }


    public String getHc_Faximile() {
        return hc_Faximile;
    }


    public void setHc_Faximile(String hc_Faximile) {
        this.hc_Faximile = hc_Faximile;
    }


    public String getHc_Email() {
        return hc_Email;
    }


    public void setHc_Email(String hc_Email) {
        this.hc_Email = hc_Email;
    }


    public String getHc_PhoneNumber() {
        return hc_PhoneNumber;
    }


    public void setHc_PhoneNumber(String hc_PhoneNumber) {
        this.hc_PhoneNumber = hc_PhoneNumber;
    }


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
