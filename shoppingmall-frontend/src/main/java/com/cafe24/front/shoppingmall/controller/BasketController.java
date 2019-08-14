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
public class BasketController{

	@Autowired
	private BasketService basketService;
	
	public void list(HashMap<String, Object> map, Model model) throws Exception {
		
	}
	
	@GetMapping("/view")
	public String view(Criteria cri, Model model, @CookieValue(name = "GeustSessionId", required = false) String geustSessionId, @AuthUser MemberVO memberVO) throws Exception {

		if(memberVO == null) {
			cri.setSessionId(geustSessionId);
		}else {
			cri.setMemberNo(memberVO.getMemberNo());
		}
		model.addAttribute("basketList",basketService.getList(cri));
		return "home/basket";
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
}
