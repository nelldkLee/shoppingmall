package com.cafe24.front.shoppingmall.security;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GuestInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String cookieName = "GeustSessionId"; 
		
		Cookie[] cookies = request.getCookies();
		boolean isGuestSessionId = false;
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals(cookieName)) isGuestSessionId = true;
		}
		
		if(!isGuestSessionId) {
			Cookie cookie = new Cookie("GeustSessionId", UUID.randomUUID().toString());
			cookie.setMaxAge(60*60*24*30);
			cookie.setPath("/");
			
			response.addCookie(cookie);
		}
		
		return true;
	}

}
