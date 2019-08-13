package com.cafe24.front.shoppingmall.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.domain.MemberVO;
import com.cafe24.front.shoppingmall.security.AuthUser;
import com.cafe24.front.shoppingmall.service.BasketService;

@Controller
@RequestMapping("/basket")
public class BasketController implements DefaultController{

	@Autowired
	private BasketService basketService;
	
	@Override
	public void list(HashMap<String, Object> map, Model model) throws Exception {
		
	}
	
	@Override
	@GetMapping("/view")
	public String view(Criteria cri, Model model) throws Exception {
		model.addAttribute("basketList",basketService.getList(cri));
		return "home/basket";
	}

	@Override
	public void register(HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String registerPost(HashMap<String, Object> map, RedirectAttributes rttr) {
		return null;
	}
	
	@PostMapping("/list")
	public @ResponseBody Map<String, Object> registerList(@RequestBody List<Map<String, Object>> listMap, @CookieValue(name = "GeustSessionId", required = false) String geustSessionId, @AuthUser MemberVO memberVO) {
		
		listMap.forEach((map)->{
			if(memberVO == null) {
				map.put("sessionId", geustSessionId);
			}else {
				map.put("memberNo", memberVO.getMemberNo());
			}	
		});
		
		return basketService.register(listMap);
		
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
