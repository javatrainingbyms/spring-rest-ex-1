package com.ms.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	@RequestMapping("testing")
	public void test() {
		System.out.println("Test Success....!!");
	}
	
	//this api will return the current date and time in response
	
	@RequestMapping("/now")
	public String dateTimeAPI() {
		Date date=new Date();
		String dateStr=date.toString();
		return dateStr;
	}
}
