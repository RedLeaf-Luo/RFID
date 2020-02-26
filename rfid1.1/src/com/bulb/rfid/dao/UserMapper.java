package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.User;
import com.bulb.rfid.entity.UserExample;

public interface UserMapper {
	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	// 查看所有用户
	List<User> selectAllUser();

	// 根据名字查询用户
	User selectUserByName(String userName);
}