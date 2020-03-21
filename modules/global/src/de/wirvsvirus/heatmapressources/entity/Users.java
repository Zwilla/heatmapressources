package de.wirvsvirus.heatmapressources.entity;

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

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Email(message = "{msg://heatmapressources_Users.email.validation.Email}")
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;


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
