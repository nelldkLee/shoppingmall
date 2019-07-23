package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.exception.ValidCustomException;
import com.cafe24.shoppingmall.mapper.MemberMapper;
import com.cafe24.shoppingmall.util.ValidationMessage;


@Service
public class BaseMemberService implements MemberService{

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void insert(MemberVO vo) {
		mapper.insert(vo);
	}

	@Override
	public MemberVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(MemberVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);
	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

	@Override
	public void verifyDuplicateId(String id) {
		if(mapper.findById(id).isPresent()) {
			throw new ValidCustomException(ValidationMessage.ID_DUPLICATED, "id");
		};
	}
}
