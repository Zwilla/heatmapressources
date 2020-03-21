package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "HEATMAPRESSOURCES_USER_RIGHTS")
@Entity(name = "heatmapressources_UserRights")
public class UserRights extends StandardEntity {
    private static final long serialVersionUID = 5364628106102559702L;

    @CaseConversion
    @NotNull
    @Column(name = "USER_RIGHTS_TYPE_NAME", nullable = false)
    protected String userRights_TypeName;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getUserRights_TypeName() {
        return userRights_TypeName;
    }


    public void setUserRights_TypeName(String userRights_TypeName) {
        this.userRights_TypeName = userRights_TypeName;
    }
}
