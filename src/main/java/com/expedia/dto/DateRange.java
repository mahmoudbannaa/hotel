package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateRange {

    private List<Integer> travelStartDate;
    private List<Integer> travelEndDate;
    private Integer lengthOfStay;

    public DateRange() {
    }

    public DateRange(List<Integer> travelStartDate, List<Integer> travelEndDate, Integer lengthOfStay) {
        this.travelStartDate = travelStartDate;
        this.travelEndDate = travelEndDate;
        this.lengthOfStay = lengthOfStay;
    }

    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
}
