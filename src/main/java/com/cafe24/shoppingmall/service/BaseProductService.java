package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ProductVO;

@Service
public class BaseProductService implements ProductService{

	@Override
	public void insert(ProductVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductVO read(Long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ProductVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}
}
