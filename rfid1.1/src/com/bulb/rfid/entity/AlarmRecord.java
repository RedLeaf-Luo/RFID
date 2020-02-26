package com.bulb.rfid.entity;

import java.util.Date;

public class AlarmRecord {
    private Integer alarmRecordId;

    private Monitor monitor;

    private String goodsName;

    private String wareHouseName;

    private Date alarmRecordTime;
    
    private Date time;

    public Integer getAlarmRecordId() {
        return alarmRecordId;
    }

    public void setAlarmRecordId(Integer alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
    }
    
    public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName == null ? null : wareHouseName.trim();
    }

    public Date getAlarmRecordTime() {
        return alarmRecordTime;
    }

    public void setAlarmRecordTime(Date alarmRecordTime) {
        this.alarmRecordTime = alarmRecordTime;
    }
    
	public void setTime(Date time) {
		this.time = this.alarmRecordTime;
	}

	public Date getTime() {
		return this.getAlarmRecordTime();
	}

	public AlarmRecord() {
		super();
	}

	@Override
	public String toString() {
		return "AlarmRecord [alarmRecordId=" + alarmRecordId + ", monitor=" + monitor + ", goodsName=" + goodsName
				+ ", wareHouseName=" + wareHouseName + ", alarmRecordTime=" + alarmRecordTime + ", time=" + time + "]";
	}

	
}