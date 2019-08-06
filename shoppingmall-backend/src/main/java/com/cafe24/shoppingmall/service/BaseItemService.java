package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ItemVO;
import com.cafe24.shoppingmall.mapper.ItemMapper;

@Service
public class BaseItemService implements ItemService{

	@Autowired
	private ItemMapper mapper;
	
	@Override
	public void insert(ItemVO vo) {
		mapper.insert(vo);
	}

	@Override
	public ItemVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(ItemVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);
	}

	@Override
	public List<ItemVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return 0;
	}

}
