package de.wirvsvirus.heatmapressources.entity.tracking_sources.services;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|gr_TrackingWhat,gr_Tracking_URL")
@Table(name = "HEATMAPRESSOURCES_GLOBAL_RESOURCES")
@Entity(name = "heatmapressources_GlobalResources")
public class GlobalResources extends StandardEntity {
    private static final long serialVersionUID = -7513844110972455847L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GR_TRACKING_WHAT_ID")
    protected TrackingWhat gr_TrackingWhat;

    @NotNull
    @Column(name = "GR_TRACKING_URL", nullable = false, length = 512)
    protected String gr_Tracking_URL;


    public void setGr_TrackingWhat(TrackingWhat gr_TrackingWhat) {
        this.gr_TrackingWhat = gr_TrackingWhat;
    }


    public TrackingWhat getGr_TrackingWhat() {
        return gr_TrackingWhat;
    }


    public String getGr_Tracking_URL() {
        return gr_Tracking_URL;
    }


    public void setGr_Tracking_URL(String gr_Tracking_URL) {
        this.gr_Tracking_URL = gr_Tracking_URL;
    }
}
