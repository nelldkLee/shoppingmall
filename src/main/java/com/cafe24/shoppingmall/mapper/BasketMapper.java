package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.BasketVO;

public interface BasketMapper extends GenericMapper<BasketVO, Long>{
	public int deleteBySessionId(String sessionId);  
	public int deleteByMemberNo(Long memberNo);  
}
