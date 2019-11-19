package com.exampl.reactservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampl.reactservice.bean.Test;
import com.exampl.reactservice.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;

	@PostMapping("add/test")
	public String add(@RequestBody Test nameOfString){
		testService.add(nameOfString);
		return "{\"message\":\"Added Successfully !\",\"statusText\":\"success\"}";
	}
	
	@GetMapping("get/string")
	public String get(){
		return "hello";
	}
}
