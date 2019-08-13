package com.cafe24.shoppingmall.service;

import java.util.List;

import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.domain.MemberVO;

public interface BasketService extends GenericService<BasketVO, Long>{
	public void isDuplicatedProduct(BasketVO vo);
	public void deleteBasketsByMember(MemberVO vo);
	public void deleteBasketByItemNo(Long itemNo);
	public void insertList(List<BasketVO> basketList);
}
