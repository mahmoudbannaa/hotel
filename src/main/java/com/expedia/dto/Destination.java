package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Destination {

    private String regionID;
    private String associatedMultiCityRegionId;
    private String longName;
    private String shortName;
    private String country;
    private String province;
    private String city;
    private String tla;
    private String nonLocalizedCity;

    public Destination() {
    }

    public Destination(String regionID, String associatedMultiCityRegionId, String longName, String shortName,
                       String country, String province, String city, String tla, String nonLocalizedCity) {
        this.regionID = regionID;
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
        this.longName = longName;
        this.shortName = shortName;
        this.country = country;
        this.province = province;
        this.city = city;
        this.tla = tla;
        this.nonLocalizedCity = nonLocalizedCity;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAssociatedMultiCityRegionId() {
        return associatedMultiCityRegionId;
    }

    public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    public void setNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
    }
}
