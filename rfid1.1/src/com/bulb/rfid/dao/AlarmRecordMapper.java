package com.bulb.rfid.dao;

import com.bulb.rfid.entity.AlarmRecord;
import com.bulb.rfid.entity.AlarmRecordExample;
import com.bulb.rfid.entity.QueryVo;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmRecordMapper {
    int countByExample(AlarmRecordExample example);

    int deleteByExample(AlarmRecordExample example);

    int deleteByPrimaryKey(Integer alarmRecordId);

    int insert(AlarmRecord record);

    int insertSelective(AlarmRecord record);

    List<AlarmRecord> selectByExample(AlarmRecordExample example);

    AlarmRecord selectByPrimaryKey(Integer alarmRecordId);

    int updateByExampleSelective(@Param("record") AlarmRecord record, @Param("example") AlarmRecordExample example);

    int updateByExample(@Param("record") AlarmRecord record, @Param("example") AlarmRecordExample example);

    int updateByPrimaryKeySelective(AlarmRecord record);

    int updateByPrimaryKey(AlarmRecord record);
    
    //获取当日报警数
    Integer selectTodayCount();

	//获取昨日报警数
	Integer selectYestodayCount();
	
	//获取本周报警数
	Integer selectWeekCount();

	//获取本月报警数
	Integer selectMonthCount();
	
	//统计当日报警数(当天)
	int countAlarmRecordToday();
	
	   //统计昨日报警数(昨天)
	int countAlarmRecordYesterday();
	
	//前天
	int countAlarmRecordTwo();
	
	//前3天
	int countAlarmRecordThree();
	
	//前4天
	int countAlarmRecordFour();
	
	//前5天
	int countAlarmRecordFive();
	
	//前6天
	int countAlarmRecordSix();
	
	//一对一关联  查询实时监控
	List<AlarmRecord> selectAllAlarmRecord();
	
	//根据查询条件查询报警记录
	List<AlarmRecord> selectAlarmRecordByQueryVo(QueryVo vo);

	//查询当天该物品的最新一条报警记录
	List<AlarmRecord> selectNowAlarmRecord();

	//根据报警记录ID查询报警详情
	AlarmRecord selectAlarmRecordInfoById(Integer alarmRecordId);

	//查找物品的报警次数
	Integer getAlarmCountByGoods(AlarmRecord ar);

	//根据RFID查询当天报警记录时间
	List<Date> selectAlarmRecordNowDateByRfid(String rfidId);

	//根据RFID,物品名称，仓库查询那个物品的所有报警记录时间
	List<Date> selectAllAlarmRecordDateByGoods(@Param("rfidId")String rfidId, @Param("goodsName")String goodsName, @Param("wareHouseName")String wareHouseName);

	//添加报警记录
	void insertAlarmRecord(AlarmRecord alarmRecord);

	//根据仓库，rfid查询实时报警记录
	List<AlarmRecord> selectNowAlarmRecordByRfidWareHouse(@Param("rfidId")String rfid, @Param("wareHouseName")String wareHouse);

}