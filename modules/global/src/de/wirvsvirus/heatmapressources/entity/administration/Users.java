package de.wirvsvirus.heatmapressources.entity.administration;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|firstName,lastName")
@Table(name = "HEATMAPRESSOURCES_USERS")
@Entity(name = "heatmapressources_Users")
public class Users extends StandardEntity {
    private static final long serialVersionUID = 888489954107171039L;

    @NotNull
    @Column(name = "FIRSTNAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @Email
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    @Column(name = "USER_RIGHTS_GROUP")
    protected String userRights_Group;

    @NotNull
    @Column(name = "USER_RIGHTS_ROLE", nullable = false)
    protected String userRights_Role;

    @NotNull
    @Column(name = "USER_RIGHTS_SUBSTITUTION", nullable = false)
    protected String userRights_Substitution;


    public String getUserRights_Group() {
        return userRights_Group;
    }


    public void setUserRights_Group(String userRights_Group) {
        this.userRights_Group = userRights_Group;
    }


    public void setUserRights_Role(String userRights_Role) {
        this.userRights_Role = userRights_Role;
    }


    public String getUserRights_Role() {
        return userRights_Role;
    }


    public void setUserRights_Substitution(String userRights_Substitution) {
        this.userRights_Substitution = userRights_Substitution;
    }


    public String getUserRights_Substitution() {
        return userRights_Substitution;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
