package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.mapper.ProductMapper;

@Service
public class BaseProductService implements ProductService{

	@Autowired
	private ProductMapper mapper;
	
	
	@Override
	public void insert(ProductVO vo) {
		mapper.insert(vo);		
	}

	@Override
	public ProductVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(ProductVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);		
	}

	@Override
	public List<ProductVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
}
