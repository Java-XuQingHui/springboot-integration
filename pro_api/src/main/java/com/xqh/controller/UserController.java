package com.xqh.controller;


import com.xqh.domain.AjaxResult;
import com.xqh.entity.User;
import com.xqh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>测试类</p>
 *
 * @author xuqinghui
 * @create 2021/8/26 23:29
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;


	@PostMapping("/addUser")
	public AjaxResult addUser(User user) {
		return userService.insert(user);
	}


	@GetMapping("/getUserById")
	public User getUserById(Integer id) {
		return userService.getUserById(id);
	}


}
