package com.cafe24.shoppingmall.repository;

import java.util.Optional;

import com.cafe24.shoppingmall.domain.MemberVO;

public interface MemberDao extends GenericRepository<MemberVO, Long>{
	public Optional<MemberVO> findById(String id);
}
