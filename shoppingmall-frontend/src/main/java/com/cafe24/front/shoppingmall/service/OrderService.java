package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> register(Map<String, Object> map){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, map, HashMap.class);
		return resultMap;
	}
	
	
}
