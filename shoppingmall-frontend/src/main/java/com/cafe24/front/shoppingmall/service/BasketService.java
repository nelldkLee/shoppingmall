package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.dto.JSONResultListHashMap;

@Service
public class BasketService {

	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> register(List<Map<String, Object>> list){
		
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/basket/list";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, list, HashMap.class);
		return resultMap;
	}
	public List<Map<String, Object>> getList(Criteria cri){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/basket"+cri.makeURL();
		JSONResultListHashMap resultMap =  restTemplate.getForObject(endpoint, JSONResultListHashMap.class);
		System.out.println(resultMap);
		return resultMap.getData();
	}
	

}
