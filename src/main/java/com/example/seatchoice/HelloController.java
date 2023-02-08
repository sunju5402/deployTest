package com.example.seatchoice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}

	@RequestMapping("/api")
	public String api() {
		return "api 호출";
	}

	@RequestMapping("/api/2")
	public String apii() {
		return "api 2에 대한 호출";
	}
}
