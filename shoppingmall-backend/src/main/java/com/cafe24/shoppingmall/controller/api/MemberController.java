package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.dto.JSONResult;
import com.cafe24.shoppingmall.service.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController extends AbstractRESTController<MemberVO, MemberService> {

	@GetMapping("/checkId/{id}")
	public JSONResult verifyDuplicateId(@PathVariable String id) {
		service.verifyDuplicateId(id);
		return JSONResult.success(null);
	}

}
