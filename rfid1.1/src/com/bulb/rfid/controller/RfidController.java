package com.bulb.rfid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.Rfid;
import com.bulb.rfid.service.RfidService;

@Controller
@RequestMapping(value = "/Rfid")
public class RfidController {

	@Autowired
	private RfidService rfidService;

	// 获取所有状态为off的rfid
	@RequestMapping(value = "/aor.action")
	@ResponseBody
	public List<Rfid> aor() {
		List<Rfid> list = rfidService.getRfidListByOff();
		return list;
	}
}
