package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.UserWareHouseExample;
import com.bulb.rfid.entity.UserWareHouseKey;

public interface UserWareHouseMapper {
	int countByExample(UserWareHouseExample example);

	int deleteByExample(UserWareHouseExample example);

	int deleteByPrimaryKey(UserWareHouseKey key);

//	int insert(UserWareHouseKey record);
	int insert(String userId , String wareHouseId);
	
	int insertSelective(UserWareHouseKey record);

	List<UserWareHouseKey> selectByExample(UserWareHouseExample example);

	int updateByExampleSelective(@Param("record") UserWareHouseKey record,
			@Param("example") UserWareHouseExample example);

	int updateByExample(@Param("record") UserWareHouseKey record, @Param("example") UserWareHouseExample example);

	void updateUserId(String userId, String wareHouseId);
	
}