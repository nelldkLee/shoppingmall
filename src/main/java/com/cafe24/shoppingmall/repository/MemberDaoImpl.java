package com.cafe24.shoppingmall.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{


	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(MemberVO vo) throws Exception {
		return sqlSession.insert("member.insert", vo);
	}

	@Override
	public MemberVO read(Long key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long key) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberVO> getList(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
