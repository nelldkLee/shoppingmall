package com.cafe24.security;

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
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		memberVO.setPassword(password);
		
		memberService.findByIdAndPassword(memberVO);
		if(authUser == null) {
			response.sendRedirect(request.getContextPath() + "/member/login");
			return false;
		}
		
		// session 처리
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);
		response.sendRedirect( request.getContextPath() );

		return false;
	}

}
