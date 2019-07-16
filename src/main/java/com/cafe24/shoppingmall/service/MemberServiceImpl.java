package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.exception.ValidCustomException;
import com.cafe24.shoppingmall.repository.MemberDao;
import com.cafe24.shoppingmall.util.ValidationMessage;


@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao memberDao;
	
	@Override
	public void register(MemberVO vo) {
		memberDao.insert(vo);
	}

	@Override
	public MemberVO view(Long key) {
		return memberDao.read(key);
	}

	@Override
	public void modify(MemberVO vo) {
		memberDao.update(vo);
	}

	@Override
	public void remove(Long key) {
		memberDao.delete(key);
	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		return memberDao.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return memberDao.getTotal(cri);
	}

	@Override
	public void verifyDuplicateId(String id) {
		if(memberDao.findById(id).isPresent()) {
			throw new ValidCustomException(ValidationMessage.ID_DUPLICATED, "id");
		};
	}
}
