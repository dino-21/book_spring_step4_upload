package org.zerock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController3 {
	// ResponseEntity 상태코드 200, 400, 500
	@GetMapping("/ex18")
	public ResponseEntity<String> ex18() {
		log.info("ex18---------------");
		String msg = "{\"name\":\"홍길동\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type", "application/json;charset=utf8");

		return new ResponseEntity<>(msg, headers, HttpStatus.OK);
	}
	
	

	// 객체 타입 json
	@GetMapping("/ex16")
	public @ResponseBody SampleDTO ex16() {
		log.info("ex16---------------");

		SampleDTO dto = new SampleDTO();
		dto.setName("kangsan");
		dto.setAge(3);

		return dto;
	}

	// 객체 타입 json
	@PostMapping("/ex17")
	public @ResponseBody String ex17(@RequestBody SampleDTO dto) {
		log.info("ex17---------------");
		log.info(dto);
		return "success";
	}
}
