package com.cafe24.shoppingmall.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.shoppingmall.vo.Criteria;

public interface GenericController<T, K> {
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) throws Exception;
	
	@GetMapping("/view")
	public void view(K key, Criteria cri, Model model) throws Exception;
	
	@GetMapping("/register")
	public void register(Criteria cri) throws Exception;
	
	@PostMapping("/register")
	public String registerPost(T vo, Criteria cri, RedirectAttributes rttr);
	
	@GetMapping("/modify")
	public void modify(K key, Criteria cri, Model model) throws Exception;
	
	@PostMapping("/modify")
	public String modify(T vo, Criteria cri) throws Exception;
	
	@PostMapping("/remove")
	public String removePost(K key, Criteria cri, Model model, RedirectAttributes rttr) throws Exception;
	
}