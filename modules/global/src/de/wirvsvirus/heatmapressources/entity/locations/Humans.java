package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "HEATMAPRESSOURCES_HUMANS")
@Entity(name = "heatmapressources_Humans")
public class Humans extends StandardEntity {
    private static final long serialVersionUID = -3225238986113551300L;

    @NotNull
    @Column(name = "HR_FIRST_NAME", nullable = false)
    protected String hr_FirstName;

    @Column(name = "HR_LAST_NAME")
    protected String hr_LastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "HR_BIRTHDAY")
    protected Date hr_Birthday;

    @CaseConversion
    @Column(name = "HR_IMEI_NUMBER", unique = true)
    protected String hr_ImeiNumber;

    @NotNull
    @Column(name = "HR_PHONENUMBER", nullable = false)
    protected String hr_phonenumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HR_TRACKED_SINCE")
    protected Date hr_Tracked_Since;

    @Column(name = "HR_HEALTH_STATE", length = 1024)
    protected String hr_healthState;

    @Column(name = "HR_DESCRIPTION")
    protected String hr_Description;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HR_LOCATION")
    protected Point hr_location_Home;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "HR_LOCATION_TRACKING")
    protected Point hr_location_Tracking;


    public Date getHr_Birthday() {
        return hr_Birthday;
    }


    public void setHr_Birthday(Date hr_Birthday) {
        this.hr_Birthday = hr_Birthday;
    }


    public Point getHr_location_Tracking() {
        return hr_location_Tracking;
    }


    public void setHr_location_Tracking(Point hr_location_Tracking) {
        this.hr_location_Tracking = hr_location_Tracking;
    }


    public String getHr_LastName() {
        return hr_LastName;
    }


    public void setHr_LastName(String hr_LastName) {
        this.hr_LastName = hr_LastName;
    }


    public String getHr_FirstName() {
        return hr_FirstName;
    }


    public void setHr_FirstName(String hr_FirstName) {
        this.hr_FirstName = hr_FirstName;
    }


    public String getHr_phonenumber() {
        return hr_phonenumber;
    }


    public void setHr_phonenumber(String hr_phonenumber) {
        this.hr_phonenumber = hr_phonenumber;
    }


    public Point getHr_location_Home() {
        return hr_location_Home;
    }


    public void setHr_location_Home(Point hr_location_Home) {
        this.hr_location_Home = hr_location_Home;
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
