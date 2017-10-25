package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelPricingInfo {

    private Double averagePriceValue;
    private Double totalPriceValue;
    private Double crossOutPriceValue;
    private Double originalPricePerNight;
    private Double percentSavings;
    private Boolean drr;

    public HotelPricingInfo() {
    }

    public HotelPricingInfo(Double averagePriceValue, Double totalPriceValue, Double crossOutPriceValue,
                            Double originalPricePerNight, Double percentSavings) {

        this.averagePriceValue = averagePriceValue;
        this.totalPriceValue = totalPriceValue;
        this.crossOutPriceValue = crossOutPriceValue;
        this.originalPricePerNight = originalPricePerNight;
        this.percentSavings = percentSavings;
    }

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public void setCrossOutPriceValue(Double crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }
}
