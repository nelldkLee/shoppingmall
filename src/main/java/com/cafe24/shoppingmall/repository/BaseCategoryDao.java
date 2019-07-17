package com.cafe24.shoppingmall.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.shoppingmall.domain.CategoryVO;
import com.cafe24.shoppingmall.domain.Criteria;

@Repository
public class BaseCategoryDao implements CategoryDao{

	@Autowired
	public SqlSession sqlSession;
	
	@Override
	public int insert(CategoryVO vo) {
		return sqlSession.insert("category.insert", vo);
	}

	@Override
	public CategoryVO read(Long key) {
		return sqlSession.selectOne("category.select", key);
	}

	@Override
	public int update(CategoryVO vo) {
		return sqlSession.update("category.update", vo);
	}

	@Override
	public int delete(Long key) {
		return sqlSession.delete("category.delete", key);
	}

	@Override
	public List<CategoryVO> getList(Criteria cri) {
		return sqlSession.selectList("category.getList", cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return sqlSession.selectOne("category.getTotal", cri);
	}

}
