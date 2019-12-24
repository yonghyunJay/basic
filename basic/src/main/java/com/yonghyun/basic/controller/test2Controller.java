package com.yonghyun.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test2Controller {
	@GetMapping("/test2")
	public String test2() {
		return "hello";
	}
}
