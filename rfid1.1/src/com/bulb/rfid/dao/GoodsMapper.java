package com.bulb.rfid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bulb.rfid.entity.Goods;
import com.bulb.rfid.entity.GoodsExample;
import com.bulb.rfid.entity.QueryVo;

public interface GoodsMapper {
	int countByExample(GoodsExample example);

	int deleteByExample(GoodsExample example);

	int insert(Goods record);

	List<Goods> selectByExample(GoodsExample example);

	int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

	int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

	int updateByPrimaryKey(Goods record);

	// 根据物品id修改物品状态
	void updateGoodsStartByGoodsId(String goodsId);

	// 统计当日商品录入数
	int countGoodsToday();

	// 统计昨天商品录入数(前一天)
	int countGoodsYesterday();

	// 前2天
	int countGoodsTwo();

	// 前3天
	int countGoodsThree();

	// 前4天
	int countGoodsFour();

	// 前5天
	int countGoodsFive();

	// 前6天
	int countGoodsSix();

	// 获取当日录入数
	Integer selectTodayCount();

	// 获取本周录入数
	Integer selectWeekCount();

	// 获取本月录入数
	Integer selectMonthCount();

	// 获取全部录入数
	Integer selectAllCount();

	// 插入物品信息
	int insertSelective(Goods record);

	// 根据物品id删除物品信息
	int deleteByPrimaryKey(String goodsId);

	// 查询所有物品记录
	List<Goods> selectAllGoods();

	// 根据查询条件查询物品记录
	List<Goods> selectGoodsByQueryVo(QueryVo vo);

	// 根据物品id查找物品信息
	Goods selectByPrimaryKey(String goodsId);

	// 查找物品详情（goods_id)
	Goods SelectGoodsByGoodsId(String goods_id);

	// 统计报警次数(goods_name)
	Integer CountAlarmRecordByGoodsName(String goods_name);

	// 根据仓库id号查询物品数量
	Integer countByWareHouseId(String wareHouseId);

	// 根据rfid查询最新一条记录的物品
	List<Goods> selectGoodByRfid(String rfidId);

	// 统计某仓库物品总数
	Integer countGoodsByWareHouseId(String warehouse_id);

	// 根据物品id修改物品信息
	int updateByPrimaryKeySelective(Goods record);

	// 求在监控的物品数量
	Integer countByGoodState(String string);
}