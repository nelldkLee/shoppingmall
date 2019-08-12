package com.cafe24.front.shoppingmall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.service.ProductService;

@Controller
public class MainController {

	@Autowired
	private ProductService productService;
	
	@GetMapping({"/", "/main"})
	public String main(Criteria cri, Model model) {
		cri.setPerPageSize(5);
		
		model.addAttribute("productList", productService.getList(cri));
		return "home/index";
	}
	@GetMapping({"/admin", "/admin/main"})
	public String adminMain() {
		return "admin/index";
	}
	
}
