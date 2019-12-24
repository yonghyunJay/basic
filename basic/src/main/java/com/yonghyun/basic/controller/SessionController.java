package com.yonghyun.basic.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.yonghyun.basic.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(
			User user,	// @ModelAttribute("user") User user 가 생략됨
			HttpSession session) {
		// 세션은 어디서든지 (현재 스프링 서버) 사용 가능
		session.setAttribute("user", user);
		// 지정된 주소로 이동(떠넘김)
		return "redirect:/main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}