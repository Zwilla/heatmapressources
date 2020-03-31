package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HEATMAPRESSOURCES_BOUNDING_BOX")
@Entity(name = "heatmapressources_BoundingBox")
public class BoundingBox extends StandardEntity {
    private static final long serialVersionUID = -973847767108297331L;

    @Column(name = "BOUNDINGBOX")
    protected String boundingbox;


    public String getBoundingbox() {
        return boundingbox;
    }


    public void setBoundingbox(String boundingbox) {
        this.boundingbox = boundingbox;
    }
}
