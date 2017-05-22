package com.g_able.exam.spring.template.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@RequestMapping(value = "/api/", method = RequestMethod.GET)
	public String main() {
		return "Hello World";
	}
}
