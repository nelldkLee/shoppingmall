package com.cafe24.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.shoppingmall.vo.Criteria;
import com.cafe24.shoppingmall.vo.MemberVo;

@Controller
@RequestMapping("/member")
public class MemberController implements GenericController<MemberVo, Long>{

	@Override
	public void list(Criteria cri, Model model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view(Long key, Criteria cri, Model model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String registerPost(MemberVo vo, Criteria cri, RedirectAttributes rttr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Long key, Criteria cri, Model model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String modify(MemberVo vo, Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removePost(Long key, Criteria cri, Model model, RedirectAttributes rttr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
