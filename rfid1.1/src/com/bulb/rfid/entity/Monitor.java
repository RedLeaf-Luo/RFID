package com.bulb.rfid.entity;

import java.util.Date;

public class Monitor {
    private Integer mId;

    private String rfidId;

    private String mState;

    private Date mTime;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getRfidId() {
        return rfidId;
    }

    public void setRfidId(String rfidId) {
        this.rfidId = rfidId == null ? null : rfidId.trim();
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState == null ? null : mState.trim();
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }
}