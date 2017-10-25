package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffersSearchResult {

    private OfferInfo offerInfo;
    private UserInfo userInfo;
    private OffersSearchResultOffersInfo offers;

    public OffersSearchResult() {
    }

    public OffersSearchResult(OfferInfo offerInfo, UserInfo userInfo, OffersSearchResultOffersInfo offers) {

        this.offerInfo = offerInfo;
        this.userInfo = userInfo;
        this.offers = offers;
    }

    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    @JsonProperty("offerInfo")
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public OffersSearchResultOffersInfo getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(OffersSearchResultOffersInfo offers) {
        this.offers = offers;
    }
}
