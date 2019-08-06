package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.CategoryVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.mapper.CategoryMapper;

@Service
public class BaseCategoryService implements CategoryService{

	@Autowired
	private CategoryMapper mapper;
	
	@Override
	public void insert(CategoryVO vo) {
		mapper.insert(vo);		
	}

	@Override
	public CategoryVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(CategoryVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);		
	}

	@Override
	public List<CategoryVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

}
