package com.cafe24.shoppingmall.controller.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.GenericRESTController;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.dto.JSONResult;

@RestController
@RequestMapping("/api/member")
public class MemberController implements GenericRESTController<MemberVO>{
	
	@Override
	public JSONResult list() throws Exception {
		System.out.println("memeber 호출");
		return JSONResult.success(null);
	}

	@Override
	public JSONResult view(@PathVariable(value="key")Long no) throws Exception {
		System.out.println("memeber get 호출");
		return JSONResult.success(null);
	}

	@Override
	public JSONResult register(@Valid @RequestBody MemberVO vo) {
		System.out.println("memeber post호출");
		return JSONResult.success(null);
	}

	@Override
	public JSONResult modify(@Valid @RequestBody MemberVO vo) throws Exception {
		System.out.println("memeber put 호출");
		return JSONResult.success(null);
	}

	@Override
	public JSONResult remove(@PathVariable(value="key")Long no) throws Exception {
		System.out.println("memeber delete 호출");
		return JSONResult.success(null);
	}

	@GetMapping("/checkId/{id}")
	public JSONResult verifyDuplicateId(@PathVariable String id) {
		return JSONResult.success(null);
	}

}
