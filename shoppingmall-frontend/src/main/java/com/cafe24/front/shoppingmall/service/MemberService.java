package com.cafe24.front.shoppingmall.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cafe24.front.shoppingmall.domain.MemberVO;
import com.cafe24.front.shoppingmall.dto.JSONResult;

@Service
public class MemberService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public Map<String, Object> checkId(Map<String, String> map) {
		
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/member/checkId/"+ map.get("id");
		HashMap<String, Object> resultMap = restTemplate.getForObject(endpoint, HashMap.class);
		System.out.println(resultMap);
		return resultMap;
	};
	public MemberVO findByIdAndPassword(Map<String, String> map) {
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/member/login";
		JSONResultMemberVO jsonResultMap = restTemplate.postForObject(endpoint, map, JSONResultMemberVO.class);
		System.out.println(jsonResultMap.getData());
		return jsonResultMap.getData();
	}
	public Map<String, Object> join(Map<String, String> map) {
		String endpoint = "http://localhost:9080/shoppingmall-backend/api/member/join";
		HashMap<String, Object> resultMap = restTemplate.postForObject(endpoint, map, HashMap.class);
		
		return resultMap;
	}

	/*
	 * private void convertMap(Map<String, Object> jsonResultMap) { ObjectMapper
	 * oMapper = new ObjectMapper(); Map<String, Object> resultMap =
	 * oMapper.convertValue(jsonResultMap.get("result"), Map.class);
	 * System.out.println(resultMap); MemberVO vo = null;
	 * if(jsonResultMap.get("result").equals("success")) { vo =
	 * MapUtil.convertMapToObject(resultMap, MemberVO.class); }
	 * System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); System.out.println(vo);
	 * }
	 */
	private static class JSONResultMemberVO extends JSONResult<MemberVO> {
	}
}
