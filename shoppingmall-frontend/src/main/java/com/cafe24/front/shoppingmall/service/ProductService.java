package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.shoppingmall.domain.Criteria;
import com.cafe24.front.shoppingmall.dto.JSONResultHashMap;
import com.cafe24.front.shoppingmall.dto.JSONResultListHashMap;

@Service
public class ProductService {

	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> register(Map<String, Object> map){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, map, HashMap.class);
		return resultMap;
	}
	
	public List<Map<String, Object>> getList(Criteria cri){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product" + cri.makeURL();
		JSONResultListHashMap resultMap =  restTemplate.getForObject(endpoint, JSONResultListHashMap.class);
		System.out.println(resultMap);
		return resultMap.getData();
	}
	
	public Map<String, Object> view(Criteria cri){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product/"+cri.getProductNo();
		JSONResultHashMap resultMap =  restTemplate.getForObject(endpoint, JSONResultHashMap.class);
		System.out.println(resultMap);
		return resultMap.getData();
	}
	
}
