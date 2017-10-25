package com.expedia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelUrgencyInfo {

    private Integer airAttachRemainingTime;
    private Integer numberOfPeopleViewing;
    private Integer numberOfPeopleBooked;
    private Integer numberOfRoomsLeft;
    private Date lastBookedTime;
    private String almostSoldStatus;
    private String link;
    private Boolean airAttachEnabled;

    public HotelUrgencyInfo() {
    }

    public HotelUrgencyInfo(Integer airAttachRemainingTime, Integer numberOfPeopleViewing, Integer numberOfPeopleBooked
            , Integer numberOfRoomsLeft, Date lastBookedTime, String almostSoldStatus, String link,
                            Boolean airAttachEnabled) {
        this.airAttachRemainingTime = airAttachRemainingTime;
        this.numberOfPeopleViewing = numberOfPeopleViewing;
        this.numberOfPeopleBooked = numberOfPeopleBooked;
        this.numberOfRoomsLeft = numberOfRoomsLeft;
        this.lastBookedTime = lastBookedTime;
        this.almostSoldStatus = almostSoldStatus;
        this.link = link;
        this.airAttachEnabled = airAttachEnabled;
    }

    public Integer getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public Integer getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public Integer getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public Integer getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public Date getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(Date lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }
}
