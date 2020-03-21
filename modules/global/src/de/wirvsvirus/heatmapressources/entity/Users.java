package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.Group;
import com.haulmont.cuba.security.entity.Role;
import com.haulmont.cuba.security.entity.UserSubstitution;

import javax.persistence.*;
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

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Email(message = "{msg://heatmapressources_Users.email.validation.Email}")
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_RIGHTS_GROUP_ID")
    protected Group userRights_Group;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_RIGHTS_ROLE_ID")
    protected Role userRights_Role;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_RIGHTS_SUBSTITUTION_ID")
    protected UserSubstitution userRights_Substitution;


    public UserSubstitution getUserRights_Substitution() {
        return userRights_Substitution;
    }


    public void setUserRights_Substitution(UserSubstitution userRights_Substitution) {
        this.userRights_Substitution = userRights_Substitution;
    }


    public Role getUserRights_Role() {
        return userRights_Role;
    }


    public void setUserRights_Role(Role userRights_Role) {
        this.userRights_Role = userRights_Role;
    }


    public Group getUserRights_Group() {
        return userRights_Group;
    }


    public void setUserRights_Group(Group userRights_Group) {
        this.userRights_Group = userRights_Group;
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
