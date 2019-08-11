package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.shoppingmall.dto.JSONResult;

@Service
public class ProductService {

	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> register(Map<String, Object> map){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, map, HashMap.class);
		return resultMap;
	}
	
	public List<Map<String, Object>> getList(){
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/product";
		JSONResultListHashMap resultMap =  restTemplate.getForObject(endpoint, JSONResultListHashMap.class);
		System.out.println(resultMap);
		return resultMap.getData();
	}
	
	private static class JSONResultListHashMap extends JSONResult<List<Map<String, Object>>> {
	}
}
