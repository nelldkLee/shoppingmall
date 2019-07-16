package com.cafe24.shoppingmall.repository;

import com.cafe24.shoppingmall.domain.MemberVO;

public interface MemberDao extends GenericRepository<MemberVO, Long>{
	public MemberVO findById(String id);
}
