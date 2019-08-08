package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MemberService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> checkId(HashMap<String, Object> map) {
		
		String endpoint = "http://localhost:8080/shoppingmall-backend/api/member/checkId/"+ map.get("id");
		HashMap<String, Object> resultMap = restTemplate.getForObject(endpoint, HashMap.class);
		System.out.println(resultMap);
		return resultMap;
	};
	public Map<String, Object> findByIdAndPassword(HashMap<String, Object> map) {
		String endpoint = "http://localhost:8080/shoppingmall-backend/api/member/login";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, map, HashMap.class);
		System.out.println(resultMap);
		return null;
	}
	
}
