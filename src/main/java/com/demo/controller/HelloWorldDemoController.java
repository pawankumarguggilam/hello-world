package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldDemoController {

	@RequestMapping("/")
	public String message() {
		return "Yay.. Your Jenkins setup was successful..!";
	}
}
