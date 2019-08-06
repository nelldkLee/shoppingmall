package com.cafe24.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String mainPage() {
		System.out.println("메인페이지");
		return "index";
	}
}
