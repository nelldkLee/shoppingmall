package com.cafe24.front.shoppingmall.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.front.shoppingmall.domain.OrderVO;
import com.cafe24.front.shoppingmall.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/register")
	public String orderRegister(OrderVO orderVO, Model model) {
		
		System.out.println("register 호출");
		System.out.println(orderVO);
		model.addAttribute("orderVO", orderVO);
		return "home/checkout";
	}
}
