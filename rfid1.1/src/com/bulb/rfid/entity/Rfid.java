package com.bulb.rfid.entity;

import java.util.Date;

public class Rfid {
    private String rfidId;

    private String userId;

    private Date rfidAddTime;

    private String state;

    public String getRfidId() {
        return rfidId;
    }

    public void setRfidId(String rfidId) {
        this.rfidId = rfidId == null ? null : rfidId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getRfidAddTime() {
        return rfidAddTime;
    }

    public void setRfidAddTime(Date rfidAddTime) {
        this.rfidAddTime = rfidAddTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}