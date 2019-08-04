package com.cafe24.shoppingmall.mapper;

import org.apache.ibatis.annotations.Param;

import com.cafe24.shoppingmall.domain.BasketVO;

public interface BasketMapper extends GenericMapper<BasketVO, Long>{
	public int deleteBySessionId(String sessionId);  
	public int deleteByMemberNo(Long memberNo);  
	public int deleteByItemNo(Long itemNo);
	public int deleteByMemberNoAndItemNo(@Param(value="memberNo") Long memberNo,@Param(value="itemNo") Long itemNo);
	public int deleteBySessionIdAndItemNo(@Param(value="sessionId")String sessionId,@Param(value="itemNo") Long itemNo);
}
