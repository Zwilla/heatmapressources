package de.wirvsvirus.heatmapressources.entity.locations;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HEATMAPRESSOURCES_ADDRESSES")
@Entity(name = "heatmapressources_Addresses")
public class Addresses extends StandardEntity {
    private static final long serialVersionUID = 4739355228354225221L;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "CITY_DISTRICT")
    protected String city_district;

    @Column(name = "CONSTRUCTION")
    protected String construction;

    @Column(name = "CONTINENT")
    protected String continent;

    @Column(name = "COUNTRY")
    protected String country;

    @Column(name = "COUNTRY_CODE")
    protected String country_code;

    @Column(name = "HOUSE_NUMBER")
    protected String house_number;

    @Column(name = "NEIGHBOURHOOD")
    protected String neighbourhood;

    @Column(name = "POSTCODE")
    protected String postcode;

    @Column(name = "PUBLIC_BUILDING")
    protected String public_building;

    @Column(name = "STATE")
    protected String state;

    @Column(name = "SUBURB")
    protected String suburb;


    public String getSuburb() {
        return suburb;
    }


    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public String getPublic_building() {
        return public_building;
    }


    public void setPublic_building(String public_building) {
        this.public_building = public_building;
    }


    public String getPostcode() {
        return postcode;
    }


    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public String getNeighbourhood() {
        return neighbourhood;
    }


    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }


    public String getHouse_number() {
        return house_number;
    }


    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }


    public String getCountry_code() {
        return country_code;
    }


    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public String getContinent() {
        return continent;
    }


    public void setContinent(String continent) {
        this.continent = continent;
    }


    public String getConstruction() {
        return construction;
    }


    public void setConstruction(String construction) {
        this.construction = construction;
    }


    public String getCity_district() {
        return city_district;
    }


    public void setCity_district(String city_district) {
        this.city_district = city_district;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }
}
