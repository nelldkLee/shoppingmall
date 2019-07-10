package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.dto.JSONResult;
import com.cafe24.shoppingmall.vo.MemberVo;

@RestController
@RequestMapping("/api")
public class RESTFulController {

	@PutMapping("/member/{id}")
	public JSONResult verifyDuplicateId(@PathVariable String id) {
		return JSONResult.success(null);
	}
}
