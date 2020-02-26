package com.bulb.rfid.entity;

import java.util.Date;

public class Inport {
	private Integer inportId;

	private String rfidId;

	private String userId;

	private String userName;

	private String goodsId;

	private String goodsName;

	private String wareHouseId;

	private String wareHouseName;

	private Date inportTime;

	private User user; // 一对一

	private Date time;

	public Date getTime() {
		return this.inportTime;
	}

	public void setTime(Date time) {
		this.time = this.getInportTime();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getInportId() {
		return inportId;
	}

	public void setInportId(Integer inportId) {
		this.inportId = inportId;
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

	public String getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId == null ? null : wareHouseId.trim();
	}

	public String getWareHouseName() {
		return wareHouseName;
	}

	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName == null ? null : wareHouseName.trim();
	}

	public Date getInportTime() {
		return inportTime;
	}

	public void setInportTime(Date inportTime) {
		this.inportTime = inportTime;
	}

	@Override
	public String toString() {
		return "Inport [inportId=" + inportId + ", rfidId=" + rfidId + ", userId=" + userId + ", userName=" + userName
				+ ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", wareHouseId=" + wareHouseId
				+ ", wareHouseName=" + wareHouseName + ", inportTime=" + inportTime + ", user=" + user + ", time="
				+ time + "]";
	}

}