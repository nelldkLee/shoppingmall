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

import com.cafe24.front.shoppingmall.domain.MemberVO;
import com.cafe24.front.shoppingmall.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController implements DefaultController{
	
	@Autowired
	public MemberService service;
	
	@GetMapping("/checkId")
	public @ResponseBody Map<String, Object> checkId(@RequestParam Map<String, String> map) {
		return service.checkId(map);
	}
	@GetMapping("/login")
	public void login() {
		System.out.println("login page call");
	}
	
	@GetMapping("/join")
	public void join() {
		System.out.println("join page call");
	}
	
	@PostMapping("/join")
	public void joinPost(Map<String, String> map) {
		service.join(map);
	}
	
	
	
	@PostMapping("/auth")
	public String loinPost(@RequestBody Map<String, String> map) {
		System.out.println(service.findByIdAndPassword(map));
		return null;
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
