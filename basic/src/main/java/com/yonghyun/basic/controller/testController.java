package com.yonghyun.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@GetMapping("/test")
	public String test() {
//		return "Hello";
		return "<h1>Hello!!</h1>";
	}
}
