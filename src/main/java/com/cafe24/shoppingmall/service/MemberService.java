package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.MemberVO;

public interface MemberService extends GenericService<MemberVO, String> {
	
	public Boolean checkID(String id);
	
	public MemberVO getMember(String id);
}