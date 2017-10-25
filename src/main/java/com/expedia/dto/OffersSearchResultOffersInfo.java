package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffersSearchResultOffersInfo {

    private List<HotelOffer> hotelOffers;

    public OffersSearchResultOffersInfo() {
    }

    public OffersSearchResultOffersInfo(List<HotelOffer> hotelOffers) {
        this.hotelOffers = hotelOffers;
    }

    public List<HotelOffer> getHotelOffers() {
        return hotelOffers;
    }

    @JsonProperty("Hotel")
    public void setHotelOffers(List<HotelOffer> hotelOffers) {
        this.hotelOffers = hotelOffers;
    }
}
