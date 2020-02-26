package com.bulb.rfid.dao;

import com.bulb.rfid.entity.Export;
import com.bulb.rfid.entity.ExportExample;
import com.bulb.rfid.entity.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportMapper {
    int countByExample(ExportExample example);

    int deleteByExample(ExportExample example);

    int deleteByPrimaryKey(Integer exportId);

    int insert(Export record);

    int insertSelective(Export record);

    List<Export> selectByExample(ExportExample example);

    Export selectByPrimaryKey(Integer exportId);

    int updateByExampleSelective(@Param("record") Export record, @Param("example") ExportExample example);

    int updateByExample(@Param("record") Export record, @Param("example") ExportExample example);

    int updateByPrimaryKeySelective(Export record);

    int updateByPrimaryKey(Export record);
    
    //根据条件查询
  	List<Export> selectExportListByQueryVo(QueryVo vo);
      
  	//根据userid查询userphone 
  	String selectUserPhoneByUserId(String userId);
  	
  	//根据仓库名查询user表中的仓库负责人username
  	String selectUserNameByWareHouseName(String wareHouseName);
    
  	//统计当天出库数
  	int countExportToday();
  	
  	//统计昨天出库数(前一天)
  	int countExportYesterday();
  	
  	//前2天
  	int countExportTwo();
  	
  	//前3天
  	int countExportThree();
  	
  	//前4天
  	int countExportFour();
  	
  	//前5天
  	int countExportFive();
  	
  	//前6天
  	int countExportSix();
  	
    //获取当日录入数
    Integer selectTodayCount();
    
	//获取本周录入数
	Integer selectWeekCount();

	//获取本月录入数
	Integer selectMonthCount();

	//获取全部录入数
	Integer selectAllCount();

	//根据查询条件查询出库记录
	List<Export> selectExportByQueryVo(QueryVo vo);

	//查询所有出库记录
	List<Export> selectAllExport();
}