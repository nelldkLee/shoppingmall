package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.MemberVO;

public interface MemberService extends GenericService<MemberVO, Long> {
	public void verifyDuplicateId(String id);
	public MemberVO login(MemberVO vo);
}