package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Polygon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_POLY_GON_DATABASE")
@Entity(name = "heatmapressources_PolyGonDatabase")
public class PolyGonDatabase extends StandardEntity {
    private static final long serialVersionUID = -51038809748689847L;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @MetaProperty(datatype = "GeoPolygon")
    @Column(name = "POLYGONE")
    protected Polygon polygone;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Polygon getPolygone() {
        return polygone;
    }


    public void setPolygone(Polygon polygone) {
        this.polygone = polygone;
    }
}
