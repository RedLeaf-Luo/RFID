package com.bulb.rfid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 跳转界面的方法
 *
 */
@Controller
public class TestController {

	@RequestMapping(value="/go.action",method = RequestMethod.GET)
	public String selectFrame() {
		return "frame";
	}
	
	@RequestMapping(value="/top.action",method = RequestMethod.GET)
	public String selectTop() {
		return "top";
	}
	
	@RequestMapping(value="/left.action",method = RequestMethod.GET)
	public String selectLeft() {
		return "left";
	}
	
	@RequestMapping(value="/tiaoMa.action",method = RequestMethod.GET)
	public String selectTiaoMa() {
		return "tiaoMa";
	}
	
	@RequestMapping(value="/goodInport.action",method = RequestMethod.GET)
	public String selectgoodInport() {
		return "goodInport";
	}
	
	@RequestMapping(value="/goodExport.action",method = RequestMethod.GET)
	public String selectgoodExport() {
		return "goodExport";
	}
	
	@RequestMapping(value="/goodWarehouse.action",method = RequestMethod.GET)
	public String selectgoodWarehouse() {
		return "goodWarehouse";
	}
	
	//test
	@RequestMapping(value="/userInsert.action",method = RequestMethod.GET)
	public String userInsert() {
		return "user_insert";
	}
}
