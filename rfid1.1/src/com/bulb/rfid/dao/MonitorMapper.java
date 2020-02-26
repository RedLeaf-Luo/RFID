package com.bulb.rfid.dao;

import com.bulb.rfid.entity.Monitor;
import com.bulb.rfid.entity.MonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    int countByExample(MonitorExample example);

    int deleteByExample(MonitorExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Monitor record);

    int insertSelective(Monitor record);

    List<Monitor> selectByExample(MonitorExample example);

    Monitor selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByExample(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByPrimaryKeySelective(Monitor record);

    int updateByPrimaryKey(Monitor record);
    
    //根据主键查查询
    public Monitor selectById(Integer mId);

    //添加嵌入式传过来的记录并获取主键值
	void insertMonitor(Monitor monitor);
}