package com.cafe24.shoppingmall.controller.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.GenericRESTController;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.dto.JSONResult;
import com.cafe24.shoppingmall.service.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController implements GenericRESTController<MemberVO>{
	
	@Autowired
	private MemberService memberService;
	
	@Override
	public JSONResult list(Criteria cri) {
		return JSONResult.success(memberService.getList(cri));
	}

	@Override
	public JSONResult view(@PathVariable(value="key")Long no, Criteria cri) {
		return JSONResult.success(memberService.view(no));
	}

	@Override
	public JSONResult register(@Valid @RequestBody MemberVO vo) {
		memberService.register(vo);
		return JSONResult.success(null);
	}

	@Override
	public JSONResult modify(@Valid @RequestBody MemberVO vo) {

		return JSONResult.success(null);
	}

	@Override
	public JSONResult remove(@PathVariable(value="key")Long no) {
		System.out.println("memeber delete 호출");
		return JSONResult.success(null);
	}

	@GetMapping("/checkId/{id}")
	public JSONResult verifyDuplicateId(@PathVariable String id) {
		return JSONResult.success(null);
	}

}
