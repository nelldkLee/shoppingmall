package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.ItemVO;
import com.cafe24.shoppingmall.domain.OptionVO;

public interface OptionMapper extends GenericMapper<OptionVO, Long>{
	public void insertOptionList(ItemVO vo);
}
