package com.cafe24.front.shoppingmall.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.service.BasketService;
import com.cafe24.front.shoppingmall.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController implements DefaultController{

	@Autowired
	private ProductService productService;
	
	@Override
	public void list(HashMap<String, Object> map, Model model) throws Exception {
	}

	@Override
	@GetMapping("/view")
	public String view(Criteria cri, Model model) throws Exception {
		model.addAttribute("productVO",productService.view(cri));
		return "home/productDetail";
	}

	@Override
	public void register(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String registerPost(HashMap<String, Object> map, RedirectAttributes rttr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(HashMap<String, Object> map, Model model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String modify(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removePost(HashMap<String, Object> map, Model model, RedirectAttributes rttr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
