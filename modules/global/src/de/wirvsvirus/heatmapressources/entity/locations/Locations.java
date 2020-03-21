package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Table(name = "HEATMAPRESSOURCES_LOCATIONS")
@Entity(name = "heatmapressources_Locations")
public class Locations extends StandardEntity {
    private static final long serialVersionUID = -8799013545360122996L;

    @NotNull
    @Column(name = "LOCATION_NAME", nullable = false)
    protected String location_Name;


    public String getLocation_Name() {
        return location_Name;
    }


    public void setLocation_Name(String location_Name) {
        this.location_Name = location_Name;
    }

    @Column(name = "LOCATION")
    @Geometry
    @MetaProperty(datatype = "GeoPoint")
    @Convert(converter = CubaPointWKTConverter.class)
    protected Point location;
}
