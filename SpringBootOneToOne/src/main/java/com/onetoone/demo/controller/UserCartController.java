package com.onetoone.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.demo.model.User;
import com.onetoone.demo.service.UserService;
@RestController
public class UserCartController {
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/saveUser")
	public User postSaveUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		return saveUser;
	}
	@GetMapping("/getData")
	public String  getData() {
		return "hello";
	}
}
