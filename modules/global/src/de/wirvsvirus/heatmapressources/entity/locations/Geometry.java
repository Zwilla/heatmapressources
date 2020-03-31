package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HEATMAPRESSOURCES_GEOMETRY")
@Entity(name = "heatmapressources_Geometry")
public class Geometry extends StandardEntity {
    private static final long serialVersionUID = 5089213856942087502L;

    @Column(name = "G_TYPE")
    protected String g_Type;

    @Column(name = "G_COORDINATES")
    protected String g_coordinates;


    public String getG_coordinates() {
        return g_coordinates;
    }


    public void setG_coordinates(String g_coordinates) {
        this.g_coordinates = g_coordinates;
    }


    public String getG_Type() {
        return g_Type;
    }


    public void setG_Type(String g_Type) {
        this.g_Type = g_Type;
    }
}
