package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_HOSPITAL")
@Entity(name = "heatmapressources_Hospital")
public class Hospital extends StandardEntity {
    private static final long serialVersionUID = -4041177584120992422L;

    @NotNull
    @Column(name = "HOSPITAL_NAME", nullable = false)
    protected String hospitalName;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getHospitalName() {
        return hospitalName;
    }


    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
