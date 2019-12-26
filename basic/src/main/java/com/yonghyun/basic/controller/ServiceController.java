package com.yonghyun.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {
	@GetMapping("/getKakaoService")
	public String getKakaoService() {
		return "getKakaoService";
	}
	
	@GetMapping("/getNaverService")
	public String getNaverService() {
		return "getNaverService";
	}
}