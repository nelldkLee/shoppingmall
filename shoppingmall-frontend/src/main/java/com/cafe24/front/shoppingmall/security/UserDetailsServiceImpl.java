package com.cafe24.front.shoppingmall.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;




@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private RestTemplate restTemplate;
	private String apiUrl = "";
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		SecurityUser securityUser = restTemplate.getForObject(apiUrl, SecurityUser.class, email);
		
		/*
		 * if(userVo != null) { securityUser.setNo(userVo.getNo());
		 * securityUser.setName(userVo.getName());
		 * securityUser.setUsername(userVo.getEmail());
		 * securityUser.setPassword(userVo.getPassword());
		 * securityUser.setAuthorities(Arrays.asList(new
		 * SimpleGrantedAuthority(userVo.getRole()))); }
		 */	
		return securityUser;
	}	
}
