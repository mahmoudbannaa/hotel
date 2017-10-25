package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelOffer {

    private DateRange offerDateRange;
    private DateRange travelEndDate;
    private Integer lengthOfStay;
    private Destination destination;
    private HotelInfo hotelInfo;
    private HotelUrgencyInfo hotelUrgencyInfo;
    private HotelPricingInfo hotelPricingInfo;
    private HotelUrls hotelUrls;


    public HotelOffer() {
    }

    public HotelOffer(DateRange offerDateRange, DateRange travelEndDate, Integer lengthOfStay, Destination destination,
                      HotelInfo hotelInfo, HotelUrgencyInfo hotelUrgencyInfo, HotelPricingInfo hotelPricingInfo,
                      HotelUrls hotelUrls) {

        this.offerDateRange = offerDateRange;
        this.travelEndDate = travelEndDate;
        this.lengthOfStay = lengthOfStay;
        this.destination = destination;
        this.hotelInfo = hotelInfo;
        this.hotelUrgencyInfo = hotelUrgencyInfo;
        this.hotelPricingInfo = hotelPricingInfo;
        this.hotelUrls = hotelUrls;
    }

    public DateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(DateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public DateRange getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(DateRange travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }
}
