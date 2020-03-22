package de.wirvsvirus.heatmapressources.entity.emergencytransportation;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_ABMULANCE")
@Entity(name = "heatmapressources_Abmulance")
public class Abmulance extends StandardEntity {
    private static final long serialVersionUID = 5111523979631362017L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ET_CONTROL_CENTER_ID")
    protected ControlCenter et_ControlCenter;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "A_LOCATION")
    protected Point a_Location;

    @NotNull
    @Column(name = "A_TRACKING_SOURCE", nullable = false)
    protected String a_tracking_source;

    @Column(name = "A_TYPE")
    protected String a_Type;

    @Column(name = "A_DIRECT_CONTACT")
    protected String a_directContact;


    public void setA_tracking_source(String a_tracking_source) {
        this.a_tracking_source = a_tracking_source;
    }


    public String getA_tracking_source() {
        return a_tracking_source;
    }


    public ControlCenter getEt_ControlCenter() {
        return et_ControlCenter;
    }


    public void setEt_ControlCenter(ControlCenter et_ControlCenter) {
        this.et_ControlCenter = et_ControlCenter;
    }


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
