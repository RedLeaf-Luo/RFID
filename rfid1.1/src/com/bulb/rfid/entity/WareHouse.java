package com.bulb.rfid.entity;

import java.util.Date;
import java.util.List;

public class WareHouse {
	private String wareHouseId;

	private String wareHouseName;

	private String wareHouseAddress;

	private Date wareHouseAddTime;

	private List<User> users;
	
	private Integer goodsNum;
	private Date time;

	public Date getTime() {
		return this.wareHouseAddTime;
	}

	public void setTime(Date time) {
		this.time = this.getWareHouseAddTime();
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;
	}

	public String getWareHouseName() {
		return wareHouseName;
	}

	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName;
	}

	public String getWareHouseAddress() {
		return wareHouseAddress;
	}

	public void setWareHouseAddress(String wareHouseAddress) {
		this.wareHouseAddress = wareHouseAddress;
	}

	public Date getWareHouseAddTime() {
		return wareHouseAddTime;
	}

	public void setWareHouseAddTime(Date wareHouseAddTime) {
		this.wareHouseAddTime = wareHouseAddTime;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}