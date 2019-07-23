package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.OptionGroupVO;
import com.cafe24.shoppingmall.domain.OptionVO;

public interface OptionMapper extends GenericMapper<OptionVO, Long>{
	public void insertOptionGroup(OptionGroupVO vo);
	public void insertOptionList(OptionGroupVO vo);
}
