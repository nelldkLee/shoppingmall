package com.cafe24.shoppingmall.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;

@Repository
public class BaseMemberDao implements MemberDao{

	@Autowired
	public SqlSession sqlSession;

	@Override
	public int insert(MemberVO vo) {
		return sqlSession.insert("member.insert", vo);
	}

	@Override
	public MemberVO read(Long key) {
		return sqlSession.selectOne("member.select", key);
	}

	@Override
	public int update(MemberVO vo) {
		return sqlSession.update("member.update", vo);
	}

	@Override
	public int delete(Long key) {
		return sqlSession.delete("member.delete", key);
	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		return sqlSession.selectList("member.getList", cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return sqlSession.selectOne("member.getTotal", cri);
	}

	@Override
	public Optional<MemberVO> findById(String id) {
		return Optional.ofNullable(sqlSession.selectOne("member.findById", id));
	}
}
