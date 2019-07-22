package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.mapper.BasketMapper;

@Service
public class BaseBasketService implements BasketService{

	@Autowired
	private BasketMapper mapper;
	
	@Override
	public void insert(BasketVO vo) {
		mapper.insert(vo);		
	}

	@Override
	public BasketVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(BasketVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);		
	}

	@Override
	public List<BasketVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

}
