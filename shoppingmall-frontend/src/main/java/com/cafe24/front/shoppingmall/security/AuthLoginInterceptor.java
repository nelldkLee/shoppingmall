package com.cafe24.front.shoppingmall.security;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cafe24.front.shoppingmall.domain.MemberVO;
import com.cafe24.front.shoppingmall.service.MemberService;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private MemberService memberService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Map<String,String> map = new HashMap<>();
		map.put("id", request.getParameter("id"));
		map.put("password", request.getParameter("password"));
		System.out.println("test1" + map);
		MemberVO authUser = memberService.findByIdAndPassword(map);
		if(authUser == null) {
			response.sendRedirect(request.getContextPath() + "/member/login");
			return false;
		}
		System.out.println("test2");
		// session 처리
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);
		response.sendRedirect( request.getContextPath() );
		System.out.println("test3");
		return false;
	}

}
