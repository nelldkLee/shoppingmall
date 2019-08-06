package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.OrderVO;
import com.cafe24.shoppingmall.mapper.BasketMapper;
import com.cafe24.shoppingmall.mapper.MemberMapper;
import com.cafe24.shoppingmall.mapper.OrderMapper;

@Service
public class BaseOrderService implements OrderService {

	@Autowired
	private OrderMapper mapper;
	@Autowired
	private BasketMapper basketMapper;
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	@Transactional
	public void insert(OrderVO vo) {
		mapper.insert(vo);
		mapper.insertOrderItem(vo);
		isBasketExistedProduct(vo);
		isOrderByGuest(vo);
	}

	@Override
	public OrderVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(OrderVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);
	}

	@Override
	public List<OrderVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return 0;
	}

	private void isBasketExistedProduct(OrderVO vo) {
		
		vo.getOrderItemList().forEach((itemVO) ->{
			if(vo.isMember()) {
				basketMapper.deleteByMemberNoAndItemNo(vo.getMemberNo(), itemVO.getItemNo());
			}else {
				basketMapper.deleteBySessionIdAndItemNo(vo.getSessionId(), itemVO.getItemNo());
			}
		});
	}

	private void isOrderByGuest(OrderVO vo) {
		if(!vo.isMember() && vo.getGuestVO() != null) {
			memberMapper.insertGuest(vo.getGuestVO());
		}
	}
}
