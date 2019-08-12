package com.cafe24.front.shoppingmall.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.service.ProductService;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public void viewProducts(Model model,Criteria cri) {
		
		System.out.println("products call");
		model.addAttribute("productList",productService.getList(cri));
	}
	@GetMapping("/registerProduct")
	public void addProductPage() {
		System.out.println("registerProduct");
		
	}
	@PostMapping("/product")
	public @ResponseBody Map<String, Object> addProduct(@RequestBody Map<String, Object> map ) {
		return productService.register(map);
	}
}
