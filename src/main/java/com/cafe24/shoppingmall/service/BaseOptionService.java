package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.OptionVO;
import com.cafe24.shoppingmall.domain.ProductDetailVO;
import com.cafe24.shoppingmall.mapper.OptionMapper;

@Service
public class BaseOptionService implements OptionService{

	@Autowired
	private OptionMapper mapper;
	
	@Override
	public void insert(OptionVO vo) {
		mapper.insert(vo);
	}

	@Override
	public OptionVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(OptionVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);
	}

	@Override
	public List<OptionVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

	@Override
	@Transactional
	public void insertOptionGroupList(ProductDetailVO vo) {
		vo.getOptionGroupList().forEach((optionGroup)->mapper.insertOptionGroup(optionGroup));
		vo.getOptionGroupList().forEach((optionGroup)->mapper.insertOptionList(optionGroup));
	}

}
