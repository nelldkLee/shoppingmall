package com.cafe24.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cafe24.jblog.repository.UserDao;
import com.cafe24.jblog.vo.UserVo;

public class AuthorizeAdminInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if(!uri.contains("/admin")) {
			return true; 
		}
		HttpSession session = request.getSession();
		UserVo userVo = (UserVo) session.getAttribute("authUser");
		String[] splitUri = uri.split("/");
		if(userVo != null && "admin".equals(splitUri[3])) {
			if(userVo.getId().equals(splitUri[2])) {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath());
		return false;
	}

}
