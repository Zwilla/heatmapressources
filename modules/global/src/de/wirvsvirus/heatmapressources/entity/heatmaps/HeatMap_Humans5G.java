package de.wirvsvirus.heatmapressources.entity.heatmaps;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|hm_Imei")
@Table(name = "HEATMAPRESSOURCES_HEAT_MAP_HUMANS5G")
@Entity(name = "heatmapressources_HeatMap_Humans5G")
public class HeatMap_Humans5G extends StandardEntity {
    private static final long serialVersionUID = 6794539811841560148L;

    @NotNull
    @Column(name = "HM_IMEI", nullable = false)
    protected String hm_Imei;


    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HM_H_LOCATION")
    protected Point hmH_Location;


    public Point getHmH_Location() {
        return hmH_Location;
    }


    public void setHmH_Location(Point hmH_Location) {
        this.hmH_Location = hmH_Location;
    }


    public String getHm_Imei() {
        return hm_Imei;
    }


    public void setHm_Imei(String hm_Imei) {
        this.hm_Imei = hm_Imei;
    }
}
