package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.WareHouse;
import com.bulb.rfid.entity.WareHouseExample;

public interface WareHouseMapper {
	int countByExample(WareHouseExample example);

	int deleteByExample(WareHouseExample example);

	// 删除仓库
	int deleteByPrimaryKey(String wareHouseId);

	int insert(WareHouse record);

	// 添加仓库
	int insertSelective(WareHouse record);

	List<WareHouse> selectByExample(WareHouseExample example);

	WareHouse selectByPrimaryKey(String wareHouseId);

	int updateByExampleSelective(@Param("record") WareHouse record, @Param("example") WareHouseExample example);

	int updateByExample(@Param("record") WareHouse record, @Param("example") WareHouseExample example);

	// 修改仓库信息
	int updateByPrimaryKeySelective(WareHouse record);

	int updateByPrimaryKey(WareHouse record);

	// 查询所有仓库列表
	List<WareHouse> selectAllWareHouse();

	// 根据仓库ID查询仓库详情
	WareHouse selectWareHouseInfoById(String wareHouseId);

	// 通过仓库名字找负责人名字
	String selectUserByWareHouseName(String wareHouseName);

	// 根据仓库名字模糊查询仓库列表
	List<WareHouse> selectWareHouseByName(String wareHouseName);

	// ---------------------
	// 根据仓库名字查询仓库
	List<WareHouse> selectWareHouseByName2(String wareHouseName);

	// 根据仓库名字判断是否重复
	int countWareHouseByName(String wareHouseName, String wareHouseId);

	// 查看仓库详情
	WareHouse selectWareHouseById(String ware_house_id);

	// 获取仓库列表
	List<WareHouse> selectWareHouseList();
}