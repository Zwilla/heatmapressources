package de.wirvsvirus.heatmapressources.entity.hospital;

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

@NamePattern("%s|rv_RespiratoryVentilator_SerialNo")
@Table(name = "HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR")
@Entity(name = "heatmapressources_RespiratoryVentilator")
public class RespiratoryVentilator extends StandardEntity {
    private static final long serialVersionUID = -879505979106357092L;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_SERIAL_NO", nullable = false)
    protected String rv_RespiratoryVentilator_SerialNo;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MODELL_NO", nullable = false)
    protected String rv_RespiratoryVentilator_ModellNo;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_TYPE", nullable = false)
    protected String rv_RespiratoryVentilator_Type;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MANUFACTURER", nullable = false)
    protected String rv_RespiratoryVentilator_Manufacturer;

    @Column(name = "RV_RESPIRATORY_VENTILATOR_PROTABLE")
    protected Boolean rv_RespiratoryVentilator_Protable = false;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MAX_PATIENTS", nullable = false)
    protected Integer rv_RespiratoryVentilator_MaxPatients;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_DESCRIPTION", nullable = false, length = 2000)
    protected String rv_RespiratoryVentilator_Description;

    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "RV_LOCATION")
    protected Point rv_location;


    public String getRv_RespiratoryVentilator_SerialNo() {
        return rv_RespiratoryVentilator_SerialNo;
    }


    public void setRv_RespiratoryVentilator_SerialNo(String rv_RespiratoryVentilator_SerialNo) {
        this.rv_RespiratoryVentilator_SerialNo = rv_RespiratoryVentilator_SerialNo;
    }


    public Point getRv_location() {
        return rv_location;
    }


    public void setRv_location(Point rv_location) {
        this.rv_location = rv_location;
    }


    public void setRv_RespiratoryVentilator_Type(String rv_RespiratoryVentilator_Type) {
        this.rv_RespiratoryVentilator_Type = rv_RespiratoryVentilator_Type;
    }


    public String getRv_RespiratoryVentilator_Type() {
        return rv_RespiratoryVentilator_Type;
    }


    public String getRv_RespiratoryVentilator_ModellNo() {
        return rv_RespiratoryVentilator_ModellNo;
    }


    public void setRv_RespiratoryVentilator_ModellNo(String rv_RespiratoryVentilator_ModellNo) {
        this.rv_RespiratoryVentilator_ModellNo = rv_RespiratoryVentilator_ModellNo;
    }


    public String getRv_RespiratoryVentilator_Manufacturer() {
        return rv_RespiratoryVentilator_Manufacturer;
    }


    public void setRv_RespiratoryVentilator_Manufacturer(String rv_RespiratoryVentilator_Manufacturer) {
        this.rv_RespiratoryVentilator_Manufacturer = rv_RespiratoryVentilator_Manufacturer;
    }


    public String getRv_RespiratoryVentilator_Description() {
        return rv_RespiratoryVentilator_Description;
    }


    public void setRv_RespiratoryVentilator_Description(String rv_RespiratoryVentilator_Description) {
        this.rv_RespiratoryVentilator_Description = rv_RespiratoryVentilator_Description;
    }


    public Integer getRv_RespiratoryVentilator_MaxPatients() {
        return rv_RespiratoryVentilator_MaxPatients;
    }


    public void setRv_RespiratoryVentilator_MaxPatients(Integer rv_RespiratoryVentilator_MaxPatients) {
        this.rv_RespiratoryVentilator_MaxPatients = rv_RespiratoryVentilator_MaxPatients;
    }


    public Boolean getRv_RespiratoryVentilator_Protable() {
        return rv_RespiratoryVentilator_Protable;
    }


    public void setRv_RespiratoryVentilator_Protable(Boolean rv_RespiratoryVentilator_Protable) {
        this.rv_RespiratoryVentilator_Protable = rv_RespiratoryVentilator_Protable;
    }


}
