package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemoController {

	@RequestMapping("/msg")
	public String message() {
		return "Yay.. Your Jenkins setup was successful..!";
	}
}
