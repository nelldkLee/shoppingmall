package com.cafe24.shoppingmall.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;

import lombok.Data;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	public SqlSession sqlSession;

	@Override
	public int insert(MemberVO vo) throws Exception {
		return sqlSession.insert("member.insert", vo);
	}

	@Override
	public MemberVO read(Long key) throws Exception {
		return sqlSession.selectOne("member.select", key);
	}

	@Override
	public int update(MemberVO vo) throws Exception {
		return sqlSession.update("member.update", vo);
	}

	@Override
	public int delete(Long key) throws Exception {
		return sqlSession.delete("member.delete", key);
	}

	@Override
	public List<MemberVO> getList(Criteria cri) throws Exception {
		return sqlSession.selectList("member.getList", cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return sqlSession.selectOne("member.getTotal", cri);
	}
	
}
