package com.bulb.rfid.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.AlarmRecord;
import com.bulb.rfid.entity.QueryVo;
import com.bulb.rfid.service.AlarmRecordService;

/* 
 * 报警表控制层
 */
@Controller
@RequestMapping(value="/AlarmRecord")
public class AlarmRecordController {

	@Autowired
	private AlarmRecordService alarmRecordService;
	
	//小程序数据界面
	@RequestMapping(value="/appletInfo.action")
	@ResponseBody
	public Map<String,Object> appletInfo() {
		Map<String,Object> map = alarmRecordService.appletInfo();
		return map;
	}
	
	//首页
	@RequestMapping(value="/index.action")
	@ResponseBody
	public Map<String,Object> index() {
		Map<String,Object> map = alarmRecordService.index();
		return map;
	}
	
	//报警统计
	@RequestMapping(value="/AlarmRecordCount.action")
	@ResponseBody
	public Map<String,Integer> inportCount() {
		Map<String,Integer> map = alarmRecordService.selectCount();
		return map;
	}
	
	//最近7天报警统计
	@RequestMapping(value="/countAlarmRecordSevenDays.action")
	public @ResponseBody
	LinkedHashMap<String,Integer> countAlarmRecordSevenDays() {
		LinkedHashMap<String, Integer> countAlarmRecord = alarmRecordService.countAlarmRecordSevenDays();
		return countAlarmRecord;
	}
	
	//查询当天该物品的最新一条报警记录
	@RequestMapping(value="/selectNowAlarmRecord.action")
	@ResponseBody
	public List<AlarmRecord> selectNowAlarmRecord(){
		List<AlarmRecord> list = alarmRecordService.selectNowAlarmRecord();
		return list;
	}
	
	//查询所有报警记录
	@RequestMapping(value="/selectAllAlarmRecord.action")
	@ResponseBody
	public List<AlarmRecord> selectAllAlarmRecord() {
		List<AlarmRecord> list = alarmRecordService.selectAllAlarmRecord();
		return list;
	}
	
	//根据查询条件查询报警记录
	@RequestMapping(value="/selectAlarmRecordByQueryVo.action")
	@ResponseBody
	public List<AlarmRecord> selectAlarmRecordByQueryVo(QueryVo vo) {
		System.out.println(vo);
		List<AlarmRecord> list = alarmRecordService.selectAlarmRecordByQueryVo(vo);
		return list;
	}
	
	//根据仓库，rfid查询实时报警记录
	@RequestMapping(value="/selectNowAlarmRecordByRfidWareHouse.action")
	@ResponseBody
	public List<AlarmRecord> selectNowAlarmRecordByRfidWareHouse(String rfidId,String wareHouseName) {
		System.out.println(rfidId +","+ wareHouseName);
		List<AlarmRecord> list = alarmRecordService.selectNowAlarmRecordByRfidWareHouse(rfidId,wareHouseName);
		return list;
	}
	
	//根据报警记录ID查询报警详情/当天的报警记录时间
	@RequestMapping(value="/selectAlarmRecordTodayInfoById.action")
	@ResponseBody
	public Map<String,Object> selectAlarmRecordTodayInfoById(Integer infoId) {
		System.out.println(infoId);
		Map<String,Object> map = alarmRecordService.selectAlarmRecordTodayInfoById(infoId);
		return map;
	}
	
	//根据报警记录ID查询报警详情/物品全部的报警记录时间
	@RequestMapping(value="/selectAlarmRecordAllInfoById.action")
	@ResponseBody
	public Map<String,Object> selectAlarmRecordAllInfoById(Integer infoId) {
		System.out.println(infoId);
		Map<String,Object> map = alarmRecordService.selectAlarmRecordAllInfoById(infoId);
		return map;
	}
}
