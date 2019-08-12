package com.cafe24.front.shoppingmall.controller;

import java.util.HashMap;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.front.shoppingmall.domain.Criteria;

public interface DefaultController {
	
	@GetMapping("/list")
	public void list(HashMap<String,Object> map, Model model) throws Exception;
	
	@GetMapping("/view")
	public String view(Criteria cri, Model model) throws Exception;
	
	@GetMapping("/register")
	public void register(HashMap<String,Object> map) throws Exception;
	
	@PostMapping("/register")
	public String registerPost(HashMap<String,Object> map, RedirectAttributes rttr);
	
	@GetMapping("/modify")
	public void modify(HashMap<String,Object> map, Model model) throws Exception;
	
	@PostMapping("/modify")
	public String modify(HashMap<String,Object> map) throws Exception;
	
	@PostMapping("/remove")
	public String removePost(HashMap<String,Object> map, Model model, RedirectAttributes rttr) throws Exception;
	
}