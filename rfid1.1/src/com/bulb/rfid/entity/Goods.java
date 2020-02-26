package com.bulb.rfid.entity;

import java.util.Date;

public class Goods {
	private String goodsId;

	private String goodsName;

	private String rfidId;

	private String wareHouseId;

	private String wareHouseName;

	private Integer inportId;

	private Date inportTime;

	private String goodsState;

	private User user;

	private Date time;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getTime() {
		return this.inportTime;
	}

	public void setTime(Date time) {
		this.time = this.getInportTime();
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

	public String getRfidId() {
		return rfidId;
	}

	public void setRfidId(String rfidId) {
		this.rfidId = rfidId == null ? null : rfidId.trim();
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

	public Integer getInportId() {
		return inportId;
	}

	public void setInportId(Integer inportId) {
		this.inportId = inportId;
	}

	public Date getInportTime() {
		return inportTime;
	}

	public void setInportTime(Date inportTime) {
		this.inportTime = inportTime;
	}

	public String getGoodsState() {
		return goodsState;
	}

	public void setGoodsState(String goodsState) {
		this.goodsState = goodsState == null ? null : goodsState.trim();
	}
}