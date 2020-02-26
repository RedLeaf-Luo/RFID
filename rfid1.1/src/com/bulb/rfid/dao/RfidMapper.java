package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.Rfid;
import com.bulb.rfid.entity.RfidExample;

public interface RfidMapper {
	int countByExample(RfidExample example);

	int deleteByExample(RfidExample example);

	int deleteByPrimaryKey(String rfidId);

	int insert(Rfid record);

	int insertSelective(Rfid record);

	List<Rfid> selectByExample(RfidExample example);

	Rfid selectByPrimaryKey(String rfidId);

	int updateByExampleSelective(@Param("record") Rfid record, @Param("example") RfidExample example);

	int updateByExample(@Param("record") Rfid record, @Param("example") RfidExample example);

	int updateByPrimaryKeySelective(Rfid record);

	int updateByPrimaryKey(Rfid record);

	// 根据rfid修改rfid状态
	void updateStateByRfidId(String rfidId);

	// 根据id获取rfid信息
	Rfid getRfid(String rfidId);

	// 查找状态为off的rfid
	List<Rfid> getRfidListByOff();

	// 修改rfid信息
	void rfidUpdate(Rfid rfid);
}