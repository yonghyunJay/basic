//package com.yonghyun.basic.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class HomeController {
//	Logger logger = LoggerFactory.getLogger(this.getClass());
//	@RequestMapping("/")
//	public String home() {
//		logger.trace("trace!");
//		logger.debug("debug!"); // 개발단계 확인용
//		logger.info("info!");	// 운용 상 필요한 정보
//		logger.warn("warning!");// 메모리 문제 등 경고
//		logger.error("error!");	// 치명적인 오류
//		return "home";
//	}
//}

package com.yonghyun.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!");
		log.info("info!");
		log.warn("warn!");
		log.error("error!");
		return "home";
	}
}
