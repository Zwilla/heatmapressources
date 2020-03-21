package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.util.Date;

@Table(name = "HEATMAPRESSOURCES_HUMANS")
@Entity(name = "heatmapressources_Humans")
public class Humans extends StandardEntity {
    private static final long serialVersionUID = -3225238986113551300L;

    @CaseConversion
    @Column(name = "HR_IMEI_NUMBER", unique = true)
    protected String hr_ImeiNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HR_TRACKED_SINCE")
    protected Date hr_Tracked_Since;

    @Column(name = "HR_HEALTH_STATE", length = 1024)
    protected String hr_healthState;

    @Column(name = "HR_DESCRIPTION")
    protected String hr_Description;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HR_LOCATION")
    protected Point hr_location;


    public Point getHr_location() {
        return hr_location;
    }


    public void setHr_location(Point hr_location) {
        this.hr_location = hr_location;
    }


    public String getHr_Description() {
        return hr_Description;
    }


    public void setHr_Description(String hr_Description) {
        this.hr_Description = hr_Description;
    }


    public String getHr_healthState() {
        return hr_healthState;
    }


    public void setHr_healthState(String hr_healthState) {
        this.hr_healthState = hr_healthState;
    }


    public Date getHr_Tracked_Since() {
        return hr_Tracked_Since;
    }


    public void setHr_Tracked_Since(Date hr_Tracked_Since) {
        this.hr_Tracked_Since = hr_Tracked_Since;
    }


    public String getHr_ImeiNumber() {
        return hr_ImeiNumber;
    }


    public void setHr_ImeiNumber(String hr_ImeiNumber) {
        this.hr_ImeiNumber = hr_ImeiNumber;
    }
}
