package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController2 {
	// 반환타입 void, String

	@GetMapping("/testVoid")
	public void funcVoid() {
		// return의 파일명이 없어도 testVoid.jsp찾으러간다.
		// void는 호출하는 URL과 동일한 이름의jsp를 의미한다.
		log.info("void---------"); 
	}

	@GetMapping("/testString")
	public String funcString() {
		// String은 jsp를 이용하는 경우에는 jsp 파일의 경로와 파일이름을 나타내기 위해서 사용한다.
		log.info("string-------------");
		return "/sample/testString";
	}
}
