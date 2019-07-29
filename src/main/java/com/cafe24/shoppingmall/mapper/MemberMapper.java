package com.cafe24.shoppingmall.mapper;

import java.util.Optional;

import com.cafe24.shoppingmall.domain.MemberVO;

public interface MemberMapper extends GenericMapper<MemberVO, Long>{
	public Optional<MemberVO> findById(String id);
	public Optional<MemberVO> findByIdAndPassword(MemberVO vo);
}
