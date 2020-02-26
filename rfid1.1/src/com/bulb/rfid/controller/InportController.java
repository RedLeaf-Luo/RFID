package com.bulb.rfid.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.Inport;
import com.bulb.rfid.entity.QueryVo;
import com.bulb.rfid.entity.User;
import com.bulb.rfid.service.InportService;

/* 
 * 入库控制层
 */
@Controller
@RequestMapping(value = "/Inport")
public class InportController {

	@Autowired
	private InportService inportService;

	// 入库统计
	@RequestMapping(value = "/inportCount.action")
	@ResponseBody
	public Map<String, Integer> inportCount() {
		Map<String, Integer> map = inportService.selectCount();
		return map;
	}

	// 最近7天商品入库统计
	@RequestMapping(value = "/countInportSevenDays.action")
	public @ResponseBody LinkedHashMap<String, Integer> countInportSevenDays() {
		LinkedHashMap<String, Integer> countInport = inportService.countInportSevenDays();
		return countInport;
	}

	// 新增入库
	@RequestMapping(value = "/inportInsert.action")
	@ResponseBody
	public String InportInsert(@RequestParam List<String> goodsIds, User user) {
		try {
			inportService.inportInsert(goodsIds, user);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 删除入库信息
	@RequestMapping(value = "/inportDelete.action")
	@ResponseBody
	public String InportDelete(Integer userId) {
		try {
			inportService.inportDelete(userId);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	// 查询所有入库记录
	@RequestMapping(value = "/selectAllInport.action")
	@ResponseBody
	public List<Inport> selectAllInport() {
		List<Inport> list = inportService.selectAllInport();
		return list;
	}

	// 根据查询条件查询入库记录
	@RequestMapping(value = "/selectInportByQueryVo.action")
	@ResponseBody
	public List<Inport> selectInportByQueryVo(QueryVo vo) {
		List<Inport> list = inportService.selectInportByQueryVo(vo);
		return list;
	}

	// 查看
	@RequestMapping(value = "/inportByid.action")
	@ResponseBody
	public Map<String, Object> inportByid(Integer infoId) {
		Map<String, Object> map = inportService.selectInportByInportId(infoId);
		return map;
	}

}
