package com.expedia.dto;

public class OfferInfo {

    private String siteID;
    private String language;
    private String currency;

    public OfferInfo() {
    }

    public OfferInfo(String siteID, String language, String currency) {

        this.siteID = siteID;
        this.language = language;
        this.currency = currency;
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
