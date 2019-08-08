package com.cafe24.front.shoppingmall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"/", "/main"})
	public String main() {
		return "index";
	}
	@GetMapping({"/admin", "/admin/main"})
	public String adminMain() {
		return "admin/index";
	}
	
}
