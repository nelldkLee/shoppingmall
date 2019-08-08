package com.cafe24.front.shoppingmall.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.front.shoppingmall.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController implements DefaultController{
	
	@Autowired
	public MemberService service;
	
	@GetMapping("/checkId")
	public @ResponseBody Map<String, Object> checkId(@RequestParam HashMap<String, Object> map) {
		return service.checkId(map);
	}
	@GetMapping("/login")
	public void login() {
		
	}
	
	@PostMapping("/login")
	public @ResponseBody Map<String, Object> login(@RequestBody HashMap<String, Object> map){
		System.out.println(map);
		return service.findByIdAndPassword(map);
	}
	
	@Override
	public void list(HashMap<String, Object> map, Model model) throws Exception {
	}

	@Override
	public void view(HashMap<String, Object> map, Model model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(HashMap<String, Object> map) throws Exception {
		
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
