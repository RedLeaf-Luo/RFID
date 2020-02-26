package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.Inport;
import com.bulb.rfid.entity.InportExample;
import com.bulb.rfid.entity.QueryVo;
import com.bulb.rfid.entity.User;

public interface InportMapper {
	int countByExample(InportExample example);

	int deleteByExample(InportExample example);

	// 删除入库记录
	int deleteByPrimaryKey(Integer inportId);

	int insert(Inport record);

	// 添加入库记录
	int insertSelective(Inport record);

	List<Inport> selectByExample(InportExample example);

	Inport selectByPrimaryKey(Integer inportId);

	int updateByExampleSelective(@Param("record") Inport record, @Param("example") InportExample example);

	int updateByExample(@Param("record") Inport record, @Param("example") InportExample example);

	int updateByPrimaryKeySelective(Inport record);

	int updateByPrimaryKey(Inport record);

	// 获取当日录入数
	Integer selectTodayCount();

	// 获取本周录入数
	Integer selectWeekCount();

	// 获取本月录入数
	Integer selectMonthCount();

	// 获取全部录入数
	Integer selectAllCount();

	// 统计当日入库数
	int countInportToday();

	// 统计昨天入库数(前一天)
	int countInportYesterday();

	// 前2天
	int countInportTwo();

	// 前3天
	int countInportThree();

	// 前4天
	int countInportFour();

	// 前5天
	int countInportFive();

	// 前6天
	int countInportSix();

	// 根据查询条件查询入库记录
	List<Inport> selectInportByQueryVo(QueryVo vo);

	// 查询所有入库记录
	List<Inport> selectAllInport();

	// 查找仓库负责人信息 (根据 ware_house_id)
	User selectUserByWareHouseId(String ware_house_id);

	// 查找入库记录详情
	Inport selectInportByInportId(Integer inport_id);
}