package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.CategoryVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.repository.CategoryDao;

@Service
public class BaseCategoryService implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public void insert(CategoryVO vo) {
		categoryDao.insert(vo);		
	}

	@Override
	public CategoryVO read(Long key) {
		return categoryDao.read(key);
	}

	@Override
	public void update(CategoryVO vo) {
		categoryDao.update(vo);
	}

	@Override
	public void delete(Long key) {
		categoryDao.delete(key);		
	}

	@Override
	public List<CategoryVO> getList(Criteria cri) {
		return categoryDao.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return categoryDao.getTotal(cri);
	}

}
