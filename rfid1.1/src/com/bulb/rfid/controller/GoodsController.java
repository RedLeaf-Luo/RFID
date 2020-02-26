package com.bulb.rfid.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.Goods;
import com.bulb.rfid.entity.QueryVo;
import com.bulb.rfid.entity.Rfid;
import com.bulb.rfid.service.GoodsService;
import com.bulb.rfid.service.RfidService;

/* 
 * 物品控制层
 */
@Controller
@RequestMapping(value = "/Goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private RfidService rfidService;

	// 物品统计
	@RequestMapping(value = "/goodsCount.action")
	@ResponseBody
	public Map<String, Integer> goodsCount() {
		Map<String, Integer> map = goodsService.selectCount();
		return map;
	}

	// 最近七天统计
	@RequestMapping(value = "/countGoodsSevenDays.action")
	public @ResponseBody LinkedHashMap<String, Integer> countGoodsSevenDays() {
		LinkedHashMap<String, Integer> countGoods = goodsService.countGoodsSevenDays();
		return countGoods;
	}

	// 新增条码
	@RequestMapping(value = "/goodsInsert.action")
	@ResponseBody
	public String GoodsInsert(Goods goods) {
		try {
			String result = goodsService.GoodsInsert(goods);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 删除条码
	@RequestMapping(value = "/goodsDelete.action")
	@ResponseBody
	public String GoodsDelete(String userId) {
		try {
			goodsService.deleteByPrimaryKey(userId);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 查询所有物品记录
	@RequestMapping(value = "/selectAllGoods.action")
	@ResponseBody
	public List<Goods> selectAllGoods() {
		List<Goods> list = goodsService.selectAllGoods();
		return list;
	}

	// 根据查询条件查询物品记录
	@RequestMapping(value = "/selectGoodsByQueryVo.action")
	@ResponseBody
	public List<Goods> selectGoodsByQueryVo(QueryVo vo) {
		List<Goods> list = goodsService.selectGoodsByQueryVo(vo);
		return list;
	}

	// 根据仓库ID查询物品列表
	@RequestMapping(value = "/selectGoodsByWareHouseId.action")
	@ResponseBody
	public List<Goods> selectGoodsByWareHouseId(String wareHouseId) {
		List<Goods> list = goodsService.selectGoodsByWareHouseId(wareHouseId);
		return list;
	}

	// 根据物品ID查询物品详情
	@RequestMapping(value = "/selectGoodsById.action")
	@ResponseBody
	public Map<String, Object> SelectGoodsByGoodsId(String infoId) {
		Map<String, Object> map = goodsService.SelectGoodsByGoodsId(infoId);
		return map;
	}

	// 编辑条码/物品信息
	// 第一步
	@RequestMapping(value = "getGoods.action")
	@ResponseBody
	public Goods getGoodsById(String goodsId) {
		try {
			Goods goods = goodsService.GetGoodsById(goodsId);
			return goods;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 第二步
	@RequestMapping(value = "/goodsUpdate.action")
	@ResponseBody
	public Map<String, Object> GoodsUpdate(Goods good) {
		goodsService.GoodsUpdate(good);
		Map<String, Object> map = new HashMap<String, Object>();
		return map;

	}

	// 解除rfid绑定
	@RequestMapping(value = "/rfidRemove.action")
	@ResponseBody
	public String goodsRfidRemove(String goodsId, String rfidId) {
		try {
			rfidService.rfidStateRemove(rfidId);
			goodsService.GoodsRfidRemove(goodsId);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 更换rfid
	// 第一步
	@RequestMapping(value = "/getOffRfid.action")
	@ResponseBody
	public List<Rfid> getOffRfid() {
		try {
			List<Rfid> list = rfidService.getRfidListByOff();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 第二步
	@RequestMapping(value = "/goodsNewRfid.action")
	@ResponseBody
	public String goodsNewRfid(String goodsId, String newRfid) {
		try {
			goodsService.GoodsNewRfid(goodsId, newRfid);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}

	}
}
