package com.bulb.rfid.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.bulb.rfid.entity.AlarmRecord;
import com.bulb.rfid.entity.QueryVo;

/*
 *报警表的增删改查（接口）
 */
public interface AlarmRecordService {
	
	//添加报警记录
	void insertAlarmRecord(AlarmRecord alarmRecord);
	
	//报警统计
	Map<String,Integer> selectCount();

	//最近7天报警统计
	LinkedHashMap<String, Integer> countAlarmRecordSevenDays();
	
	//查询所有报警记录
	List<AlarmRecord> selectAllAlarmRecord();

	//根据查询条件查询报警记录
	List<AlarmRecord> selectAlarmRecordByQueryVo(QueryVo vo);

	//查询当天该物品的最新一条报警记录
	List<AlarmRecord> selectNowAlarmRecord();

	//根据报警记录ID查询报警详情/当天的报警记录时间
	Map<String, Object> selectAlarmRecordTodayInfoById(Integer alarmRecordId);

	//根据报警记录ID查询报警详情/物品全部的报警记录时间
	Map<String, Object> selectAlarmRecordAllInfoById(Integer alarmRecordId);

	//根据仓库，rfid查询实时报警记录
	List<AlarmRecord> selectNowAlarmRecordByRfidWareHouse(String rfidId, String wareHouseName);

	//首页
	Map<String, Object> index();

	//小程序数据界面
	Map<String, Object> appletInfo();
}
