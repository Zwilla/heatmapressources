package de.wirvsvirus.heatmapressources.entity.tracking_sources.services;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ts_AboutWhat")
@Table(name = "HEATMAPRESSOURCES_ABOUT_TRACKING")
@Entity(name = "heatmapressources_AboutTracking")
public class AboutTracking extends StandardEntity {
    private static final long serialVersionUID = -524388662192839402L;

    @NotNull
    @Column(name = "TS_ABOUT_WHAT", nullable = false)
    protected String ts_AboutWhat;

    @NotNull
    @Column(name = "TS_WEBSITE", nullable = false)
    protected String ts_Website;

    @Column(name = "TS_CONTACT_MAIL")
    protected String ts_contact_mail;

    @Column(name = "TS_CONTACT_PHONE")
    protected String ts_contact_phone;

    @NotNull
    @Lob
    @Column(name = "TS_DESCRIPTION", nullable = false)
    protected String ts_description;


    public String getTs_description() {
        return ts_description;
    }


    public void setTs_description(String ts_description) {
        this.ts_description = ts_description;
    }


    public String getTs_contact_phone() {
        return ts_contact_phone;
    }


    public void setTs_contact_phone(String ts_contact_phone) {
        this.ts_contact_phone = ts_contact_phone;
    }


    public String getTs_contact_mail() {
        return ts_contact_mail;
    }


    public void setTs_contact_mail(String ts_contact_mail) {
        this.ts_contact_mail = ts_contact_mail;
    }


    public String getTs_Website() {
        return ts_Website;
    }


    public void setTs_Website(String ts_Website) {
        this.ts_Website = ts_Website;
    }


    public String getTs_AboutWhat() {
        return ts_AboutWhat;
    }


    public void setTs_AboutWhat(String ts_AboutWhat) {
        this.ts_AboutWhat = ts_AboutWhat;
    }
}
