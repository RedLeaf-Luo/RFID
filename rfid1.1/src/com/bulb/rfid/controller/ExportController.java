package com.bulb.rfid.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.Export;
import com.bulb.rfid.entity.Goods;
import com.bulb.rfid.entity.QueryVo;
import com.bulb.rfid.service.ExportService;

/* 
 * 出库控制层
 */
@Controller
@RequestMapping(value = "/Export")
public class ExportController {

	@Autowired
	private ExportService exportService;

	// 查询所有
	@RequestMapping(value = "/selectAll.action")
	public @ResponseBody List<Export> selectAll() {
		List<Export> list = exportService.selectAll();
		return list;
	}

	// 增加
	@RequestMapping(value = "/insert.action")
	public @ResponseBody String insert(@RequestBody Goods g, HttpServletRequest request) {
		exportService.insert(g);
		return "ok";
	}

	// 删除
	@RequestMapping(value = "/delete.action")
	public @ResponseBody String delete(@RequestBody Integer exportId) {
		exportService.delete(exportId);
		return "ok";
	}

	// 查看
	@RequestMapping(value = "/selectById.action")
	public @ResponseBody Map<String, Object> selectByExportId(Integer infoId) {
		System.out.println(infoId);
		Map<String, Object> map = exportService.selectExportByExportId(infoId);
		return map;
	}

	// 根据tiaojian查询
	@RequestMapping(value = "/selectByQueryVo.action")
	public @ResponseBody List<Export> selectByRfid(QueryVo vo) {
		List<Export> list = exportService.selectExportListByQueryVo(vo);
		return list;
	}

	// 修改
	@RequestMapping(value = "/toupdate.action")
	public @ResponseBody Export toupdate(@RequestBody Integer exportId, HttpServletRequest request) {
		Export list = exportService.selectByExportId(exportId);
		return list;
	}

	@RequestMapping(value = "/update.action")
	public @ResponseBody Export update(@RequestBody Export ex, HttpServletRequest request) {
		exportService.update(ex);
		return ex;
	}

	// 出库统计
	@RequestMapping(value = "/exportCount.action")
	@ResponseBody
	public Map<String, Integer> exportCount() {
		Map<String, Integer> map = exportService.selectCount();
		return map;
	}

	// 最近七天出库商品统计
	@RequestMapping(value = "/countExportSevenDays.action")
	public @ResponseBody LinkedHashMap<String, Integer> countExportSevenDays() {
		LinkedHashMap<String, Integer> countExport = exportService.countExportSevenDays();
		return countExport;
	}

	// 查询所有出库记录
	@RequestMapping(value = "/selectAllExport.action")
	@ResponseBody
	public List<Export> selectAllExport() {
		List<Export> list = exportService.selectAllExport();
		return list;
	}

	// 根据查询条件查询出库记录
	@RequestMapping(value = "/selectExportByQueryVo.action")
	@ResponseBody
	public List<Export> selectExportByQueryVo(QueryVo vo) {
		List<Export> list = exportService.selectExportByQueryVo(vo);
		return list;
	}
}
