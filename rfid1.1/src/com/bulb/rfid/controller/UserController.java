package com.bulb.rfid.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bulb.rfid.entity.User;
import com.bulb.rfid.entity.e3Result;
import com.bulb.rfid.service.UserService;

/* 
 * User控制层
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {

	@Autowired
	private UserService userService;

	// 用户注册
	@RequestMapping(value = "/insertUser.action")
	@ResponseBody
	public String insertUser(User user) {
		// 设置id值
		String userId = UUID.randomUUID().toString().replaceAll("-", "");
		user.setUserId(userId);
		// 插入当前时间
		Date day = new Date();
		user.setAddTime(day);
		userService.insertUser(user);
		return "ok";
	}

	// 用户注销
	@RequestMapping(value = "/deleteUserById.action")
	@ResponseBody
	public Map<String, String> deleteUserById(String userId) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(userId);
		userService.deleteUserById(userId);
		map.put("result", "ok");
		return map;
	}

	// 通过userID获取个人信息
	@RequestMapping(value = "/editUserById.action")
	public String editUserById(String infoId, Model model) {
		User u = userService.editUserById(infoId);
		model.addAttribute("user", u);
		return "user_insert";
	}

	// 修改用户
	@RequestMapping(value = "/updateUserById.action")
	@ResponseBody
	public String updateUserById(User u) {
		userService.updateUserById(u);
		return "ok";
	}

	// 查询所有用户列表
	@RequestMapping(value = "/selectAllUser.action")
	@ResponseBody
	public List<User> selectAllUser() {
		List<User> list = userService.selectAllUser();
		return list;
	}

	// 通过账号搜索查询用户
	@RequestMapping(value = "/selectUserByAccount.action")
	@ResponseBody
	public User selectUserByAccount(String userAccount) {
		User user = userService.selectUserByAccount(userAccount);
		return user;
	}

	// 单点登录
	@RequestMapping(value = "/login.action")
	@ResponseBody
	// 1、接收两个参数。
	public e3Result login(String userAccount, String userPassword) {
		// 2、调用Service进行登录。
		e3Result result = userService.login(userAccount, userPassword);
		return result;
	}

	// 根据token获取redis中用户登录的信息
	@RequestMapping(value = "/token.action")
	@ResponseBody
	public e3Result getUserByToken(String token) {
		e3Result userInfo = userService.getUserByToken(token);
		return userInfo;
	}
}
