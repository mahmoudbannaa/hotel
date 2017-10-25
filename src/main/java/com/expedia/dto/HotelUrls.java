package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelUrls {

    private String hotelInfositeUrl;
    private String hotelSearchResultUrl;

    public HotelUrls() {
    }

    public HotelUrls(String hotelInfositeUrl, String hotelSearchResultUrl) {

        this.hotelInfositeUrl = hotelInfositeUrl;
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }
}
