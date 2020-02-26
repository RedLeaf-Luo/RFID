package com.bulb.rfid.entity;

import java.util.Date;

/*
 * 后台的查询条件（监控管理，物品管理）
 */
public class QueryVo {
	private String rfidId;// 根据RFID编号查询
	private String wareHouseId; // 仓库ID
	private String wareHouseName;
	private Date beginTime;// 开始时间
	private Date endTime;// 结束时间

	public String getRfidId() {
		return rfidId;
	}

	public void setRfidId(String rfidId) {
		this.rfidId = rfidId;
	}

	public String getWareHouseName() {
		return wareHouseName;
	}

	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;
	}

	@Override
	public String toString() {
		return "QueryVo [rfidId=" + rfidId + ", wareHouseId=" + wareHouseId + ", wareHouseName=" + wareHouseName
				+ ", beginTime=" + beginTime + ", endTime=" + endTime + "]";
	}

}
