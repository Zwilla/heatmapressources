package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name = "HEATMAPRESSOURCES_ADRESSES_CLASS")
@Entity(name = "heatmapressources_AdressesClass")
public class AdressesClass extends StandardEntity {
    private static final long serialVersionUID = -8158254462505707666L;

    @Column(name = "AC_CLASS")
    protected String ac_class;

    @Column(name = "AC_DISPLAY_NAME", length = 2048)
    protected String ac_display_name;

    @Column(name = "AC_IMPORTANCE")
    protected Double ac_importance;

    @Column(name = "AC_LAT")
    protected String ac_lat;

    @Column(name = "AC_LICENCE", length = 1024)
    protected String ac_licence;

    @Column(name = "AC_LON")
    protected String ac_lon;

    @Column(name = "AC_OSM_ID")
    protected String ac_osm_id;

    @Column(name = "AC_OSM_TYPE")
    protected String ac_osm_type;

    @Column(name = "AC_PLACE_ID")
    protected String ac_place_id;

    @Lob
    @Column(name = "AC_SVG")
    protected String ac_svg;

    @Column(name = "AC_TYPE", length = 1024)
    protected String ac_type;


    public void setAc_importance(Double ac_importance) {
        this.ac_importance = ac_importance;
    }


    public Double getAc_importance() {
        return ac_importance;
    }


    public String getAc_type() {
        return ac_type;
    }


    public void setAc_type(String ac_type) {
        this.ac_type = ac_type;
    }


    public String getAc_svg() {
        return ac_svg;
    }


    public void setAc_svg(String ac_svg) {
        this.ac_svg = ac_svg;
    }


    public String getAc_place_id() {
        return ac_place_id;
    }


    public void setAc_place_id(String ac_place_id) {
        this.ac_place_id = ac_place_id;
    }


    public String getAc_osm_type() {
        return ac_osm_type;
    }


    public void setAc_osm_type(String ac_osm_type) {
        this.ac_osm_type = ac_osm_type;
    }


    public String getAc_osm_id() {
        return ac_osm_id;
    }


    public void setAc_osm_id(String ac_osm_id) {
        this.ac_osm_id = ac_osm_id;
    }


    public String getAc_lon() {
        return ac_lon;
    }


    public void setAc_lon(String ac_lon) {
        this.ac_lon = ac_lon;
    }


    public String getAc_licence() {
        return ac_licence;
    }


    public void setAc_licence(String ac_licence) {
        this.ac_licence = ac_licence;
    }


    public String getAc_lat() {
        return ac_lat;
    }


    public void setAc_lat(String ac_lat) {
        this.ac_lat = ac_lat;
    }


    public String getAc_display_name() {
        return ac_display_name;
    }


    public void setAc_display_name(String ac_display_name) {
        this.ac_display_name = ac_display_name;
    }


    public String getAc_class() {
        return ac_class;
    }


    public void setAc_class(String ac_class) {
        this.ac_class = ac_class;
    }
}
