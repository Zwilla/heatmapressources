package de.wirvsvirus.heatmapressources.entity.tracking_sources.services;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_TRACKING_WHAT")
@Entity(name = "heatmapressources_TrackingWhat")
public class TrackingWhat extends StandardEntity {
    private static final long serialVersionUID = -4471991426060852848L;

    @NotNull
    @Column(name = "GR_TRACKING_THIS", nullable = false, unique = true)
    protected String gr_Tracking_This;


    public String getGr_Tracking_This() {
        return gr_Tracking_This;
    }


    public void setGr_Tracking_This(String gr_Tracking_This) {
        this.gr_Tracking_This = gr_Tracking_This;
    }
}
