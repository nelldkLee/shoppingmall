package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;

public interface BasketService extends GenericService<BasketVO, Long>{
	public void checkDuplicatedProduct(BasketVO vo, Criteria cri);
	public void deleteBasketsByMember(MemberVO vo);
}
