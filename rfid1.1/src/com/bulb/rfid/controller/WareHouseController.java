package com.bulb.rfid.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.WareHouse;
import com.bulb.rfid.service.WareHouseService;

/* 
 * 仓库控制层
 */
@Controller
@RequestMapping(value = "/WareHouse")
public class WareHouseController {

	@Autowired
	private WareHouseService wareHouseService;

	// 新增仓库
	@RequestMapping(value = "/warehouseInsert.action")
	@ResponseBody
	public Map<String, Object> warehouseInsert(WareHouse wareHouse, String userId) {
		Map<String, Object> map = new HashMap<>();
		wareHouseService.warehouseInsert(wareHouse, userId);
		return map;
	}

	// 删除仓库
	@RequestMapping(value = "/warehouseDelete.action")
	@ResponseBody
	public String warehouseDelete(String userId) {
		try {
			wareHouseService.warehouseDelete(userId);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 查询所有仓库列表
	@RequestMapping(value = "/selectAllWareHouse.action")
	@ResponseBody
	public List<WareHouse> selectAllWareHouse() {
		List<WareHouse> list = wareHouseService.showAllWareHouse();
		return list;
	}

	// 根据仓库名字模糊查询仓库列表
	@RequestMapping(value = "/selectWareHouseByName.action")
	@ResponseBody
	public List<WareHouse> selectWareHouseByName(String wareHouseName) {
		List<WareHouse> list = wareHouseService.selectWareByName(wareHouseName);
		System.out.println(list);
		return list;
	}

	// 根据仓库ID查询仓库详情
	@RequestMapping(value = "/selectWareHouseInfoById.action")
	@ResponseBody
	public Map<String, Object> warehouseById(String infoId) {
		Map<String, Object> map = wareHouseService.selectWareHouseById(infoId);
		return map;
	}

	// 获取仓库列表
	@RequestMapping(value = "/warehouseList.action")
	@ResponseBody
	public List<WareHouse> warehouseList() {
		try {
			List<WareHouse> list = wareHouseService.selectWareHouseList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 编辑仓库
	// 第一步是根据仓库ID查询仓库详情的接口
	// 第二步：
	@RequestMapping(value = "/warehouseUpdate.action")
	@ResponseBody
	public Map<String, Object> warehouseUpdate(WareHouse ware_house, String userName) {
		Map<String, Object> map = new HashMap<>();
		String result = wareHouseService.warehouseUpdate(ware_house, userName);
		map.put("result", result);
		return map;
	}
}
