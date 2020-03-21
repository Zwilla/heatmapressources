package de.wirvsvirus.heatmapressources.entity.emergencytransportation;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HEATMAPRESSOURCES_ABMULANCE")
@Entity(name = "heatmapressources_Abmulance")
public class Abmulance extends StandardEntity {
    private static final long serialVersionUID = 5111523979631362017L;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "A_LOCATION")
    protected Point a_Location;

    @Column(name = "A_TYPE")
    protected String a_Type;

    @Column(name = "A_DIRECT_CONTACT")
    protected String a_directContact;


    public String getA_directContact() {
        return a_directContact;
    }


    public void setA_directContact(String a_directContact) {
        this.a_directContact = a_directContact;
    }


    public String getA_Type() {
        return a_Type;
    }


    public void setA_Type(String a_Type) {
        this.a_Type = a_Type;
    }


    public Point getA_Location() {
        return a_Location;
    }


    public void setA_Location(Point a_Location) {
        this.a_Location = a_Location;
    }
}
