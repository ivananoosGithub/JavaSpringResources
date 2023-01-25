package com.ivankimanoos.springboot.thymeleaf.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHelloWorld(Model theModel) {
		
		theModel.addAttribute("heheDate", new java.util.Date());
		
		return "helloworld";
	}
}
