package de.wirvsvirus.heatmapressources.entity.tracking_sources;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import de.wirvsvirus.heatmapressources.entity.PositioningOver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|tr_TrackOver")
@Table(name = "HEATMAPRESSOURCES_TRACKING")
@Entity(name = "heatmapressources_Tracking")
public class Tracking extends StandardEntity {
    private static final long serialVersionUID = -9121621391539592742L;

    @Column(name = "TR_TRACK_OVER")
    protected String tr_TrackOver;


    public void setTr_TrackOver(PositioningOver tr_TrackOver) {
        this.tr_TrackOver = tr_TrackOver == null ? null : tr_TrackOver.getId();
    }


    public PositioningOver getTr_TrackOver() {
        return tr_TrackOver == null ? null : PositioningOver.fromId(tr_TrackOver);
    }


}
