package com.bulb.rfid.entity;

import java.util.Date;

public class Export {
    private Integer exportId;

    private String rfidId;

    private String userId;

    private String userName;

    private String goodsId;

    private String goodsName;

    private String wareHouseName;

    private Date exportTime;
    
    private Date time;

    public Integer getExportId() {
        return exportId;
    }

    public void setExportId(Integer exportId) {
        this.exportId = exportId;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
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

    public Date getExportTime() {
        return exportTime;
    }

    public void setExportTime(Date exportTime) {
        this.exportTime = exportTime;
    }

	public void setTime(Date time) {
		this.time = this.exportTime;
	}

	public Date getTime() {
		return this.getExportTime();
	}

	@Override
	public String toString() {
		return "Export [exportId=" + exportId + ", rfidId=" + rfidId + ", userId=" + userId + ", userName=" + userName
				+ ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", wareHouseName=" + wareHouseName
				+ ", exportTime=" + exportTime + ", time=" + time + "]";
	}

	
}