package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.EntityLogItem;

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
    @Column(name = "RV_RESPIRATORY_VENTILATOR_PROTABLE", nullable = false)
    protected Boolean rv_RespiratoryVentilator_Protable = false;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RV_RESPIRATORY_VENTILATOR_LOCATION_ID")
    protected HospitalPatientRoom rv_RespiratoryVentilator_Location;


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
