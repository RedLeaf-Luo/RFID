package com.bulb.rfid.entity;

import java.util.Date;

public class WareHouseQueryVo {
	private String wareHouseId;// 仓库ID

	private String wareHouseName;// 仓库名称

	private Date wareHouseAddTime;// 仓库的增加时间

	private String userName;// 仓库负责人

	private String userPhone;// 联系电话

	private Integer GoodsCount;// 仓库的物品数量

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

	public Date getWareHouseAddTime() {
		return wareHouseAddTime;
	}

	public void setWareHouseAddTime(Date wareHouseAddTime) {
		this.wareHouseAddTime = wareHouseAddTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getGoodsCount() {
		return GoodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		GoodsCount = goodsCount;
	}

}