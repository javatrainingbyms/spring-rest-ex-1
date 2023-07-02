package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.User;
import com.ms.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//@RequestMapping(value="/findUser", method=RequestMethod.GET, produces = "application/json")
	@GetMapping(value="/findUser",  produces = "application/json")
	public User findUserById(@RequestParam("id") String userid) {
		User user=userService.findUserById(userid);
		return user;
	}
}
