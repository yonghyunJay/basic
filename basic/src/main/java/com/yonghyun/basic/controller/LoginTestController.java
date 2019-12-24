package com.yonghyun.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginTestController {
	@GetMapping("/loginTest")
	public String login() {
		return "loginTest";
	}
	
	@PostMapping("/loginTest")
	@ResponseBody
	public String loginPost(
		@RequestParam("id") String id,
		@RequestParam("pw") String pw) {
		String dbId = "boot";
		String dbPw = "1234";
		
		if(dbId.equals(id) && dbPw.equals(pw)) {
			return "로그인 성공";
		}
		
		return "로그인 실패";
	}
}
