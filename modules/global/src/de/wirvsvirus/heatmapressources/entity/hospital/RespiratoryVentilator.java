package de.wirvsvirus.heatmapressources.entity.hospital;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.EntityLogItem;
import de.wirvsvirus.heatmapressources.entity.hospital.HospitalPatientRoom;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_RESPIRATORY_VENTILATOR")
@Entity(name = "heatmapressources_RespiratoryVentilator")
public class RespiratoryVentilator extends StandardEntity {
    private static final long serialVersionUID = -879505979106357092L;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_TYPE", nullable = false, columnDefinition = "local,portable")
    protected String rv_RespiratoryVentilator_Type;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MANUFACTURER", nullable = false)
    protected String rv_RespiratoryVentilator_Manufacturer;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RV_RESPIRATORY_VENTILATOR_LOCATION_ID")
    protected HospitalPatientRoom rv_RespiratoryVentilator_Location;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_PROTABLE", nullable = false)
    protected Boolean rv_RespiratoryVentilator_Protable = false;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MAX_PATIENTS", nullable = false)
    protected Integer rv_RespiratoryVentilator_MaxPatients;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_MODELL_NO", nullable = false)
    protected String rv_RespiratoryVentilator_ModellNo;

    @NotNull
    @Column(name = "RV_RESPIRATORY_VENTILATOR_DESCRIPTION", nullable = false, length = 2000)
    protected String rv_RespiratoryVentilator_Description;


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


    public HospitalPatientRoom getRv_RespiratoryVentilator_Location() {
        return rv_RespiratoryVentilator_Location;
    }


    public void setRv_RespiratoryVentilator_Location(HospitalPatientRoom rv_RespiratoryVentilator_Location) {
        this.rv_RespiratoryVentilator_Location = rv_RespiratoryVentilator_Location;
    }


    public Boolean getRv_RespiratoryVentilator_Protable() {
        return rv_RespiratoryVentilator_Protable;
    }


    public void setRv_RespiratoryVentilator_Protable(Boolean rv_RespiratoryVentilator_Protable) {
        this.rv_RespiratoryVentilator_Protable = rv_RespiratoryVentilator_Protable;
    }


    public EntityLogItem.Type getRv_RespiratoryVentilator_Type() {
        return rv_RespiratoryVentilator_Type == null ? null : EntityLogItem.Type.fromId(rv_RespiratoryVentilator_Type);
    }


    public void setRv_RespiratoryVentilator_Type(EntityLogItem.Type rv_RespiratoryVentilator_Type) {
        this.rv_RespiratoryVentilator_Type = rv_RespiratoryVentilator_Type == null ? null : rv_RespiratoryVentilator_Type.getId();
    }
}
