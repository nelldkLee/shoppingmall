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
		checkDuplicatedProduck(vo);
	}

	private void checkDuplicatedProduck(BasketVO vo) {
		Criteria cri = new Criteria();
		cri.setProductDetailNo(vo.getProductDetailNo());
		List<BasketVO> list =  mapper.getList(cri);
		if(list.size() > 0) {
			System.out.println("update 테스트");
			System.out.println("기존 count" + list.get(0).getCount());
			System.out.println("추가되는 count" + vo.getCount());
			vo.setCount(list.get(0).getCount() + vo.getCount());
			mapper.update(vo);
		} else {
			System.out.println("insert 테스트");
			mapper.insert(vo);
		}
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
