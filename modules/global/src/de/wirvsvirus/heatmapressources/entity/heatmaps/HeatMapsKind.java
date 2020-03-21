package de.wirvsvirus.heatmapressources.entity.heatmaps;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_HEAT_MAPS_KIND")
@Entity(name = "heatmapressources_HeatMapsKind")
public class HeatMapsKind extends StandardEntity {
    private static final long serialVersionUID = -6124180897473924719L;

    @NotNull
    @Column(name = "HEAT_MAPS_KIND_NAME", nullable = false)
    protected String heatMaps_KindName;

    @NotNull
    @Column(name = "HEAT_MAPS_KIND_DESCRIPTION", nullable = false, length = 2000)
    protected String heatMaps_Kind_description;


    public String getHeatMaps_Kind_description() {
        return heatMaps_Kind_description;
    }


    public void setHeatMaps_Kind_description(String heatMaps_Kind_description) {
        this.heatMaps_Kind_description = heatMaps_Kind_description;
    }


    public String getHeatMaps_KindName() {
        return heatMaps_KindName;
    }


    public void setHeatMaps_KindName(String heatMaps_KindName) {
        this.heatMaps_KindName = heatMaps_KindName;
    }
}
