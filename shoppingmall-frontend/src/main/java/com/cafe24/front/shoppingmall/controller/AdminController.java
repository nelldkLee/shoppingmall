package com.cafe24.front.shoppingmall.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@GetMapping("/products")
	public void viewProducts() {
		System.out.println("products call");
	}
	@GetMapping("/registerProduct")
	public void addProductPage() {
		System.out.println("registerProduct");
	}
	@PostMapping("/registerProduct")
	public void addProduct(@RequestBody Map<String, String> map ) {
		
	}
}
