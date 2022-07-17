package com.example.AutoGeniune.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/web")
	public String welcome() {
		System.out.println("in home controller");
		return "welcome to my first project";
	}
}
