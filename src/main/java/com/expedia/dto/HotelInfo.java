package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelInfo {

    private String hotelId ;
    private String hotelName;
    private String localizedHotelName;
    private String hotelDestination;
    private String hotelDestinationRegionID;
    private String hotelLongDestination;
    private String hotelStreetAddress;
    private String hotelCity;
    private String hotelProvince;
    private String hotelCountryCode;
    private String hotelLatitude;
    private String hotelLongitude;
    private Double hotelGuestReviewRating;
    private Integer hotelReviewTotal;
    private String hotelImageUrl;
    private Boolean isOfficialRating;

    public HotelInfo() {
    }

    public HotelInfo(String hotelId, String hotelName, String localizedHotelName, String hotelDestination,
                     String hotelDestinationRegionID, String hotelLongDestination, String hotelStreetAddress,
                     String hotelCity, String hotelProvince, String hotelCountryCode, String hotelLatitude,
                     String hotelLongitude, Double hotelGuestReviewRating, Integer hotelReviewTotal,
                     String hotelImageUrl, Boolean isOfficialRating) {

        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.localizedHotelName = localizedHotelName;
        this.hotelDestination = hotelDestination;
        this.hotelDestinationRegionID = hotelDestinationRegionID;
        this.hotelLongDestination = hotelLongDestination;
        this.hotelStreetAddress = hotelStreetAddress;
        this.hotelCity = hotelCity;
        this.hotelProvince = hotelProvince;
        this.hotelCountryCode = hotelCountryCode;
        this.hotelLatitude = hotelLatitude;
        this.hotelLongitude = hotelLongitude;
        this.hotelGuestReviewRating = hotelGuestReviewRating;
        this.hotelReviewTotal = hotelReviewTotal;
        this.hotelImageUrl = hotelImageUrl;
        this.isOfficialRating = isOfficialRating;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public String getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(String hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public String getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(String hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public Boolean getOfficialRating() {
        return isOfficialRating;
    }

    public void setOfficialRating(Boolean officialRating) {
        isOfficialRating = officialRating;
    }
}
