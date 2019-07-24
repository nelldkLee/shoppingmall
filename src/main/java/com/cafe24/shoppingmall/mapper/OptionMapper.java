package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.OptionVO;
import com.cafe24.shoppingmall.domain.ProductDetailVO;

public interface OptionMapper extends GenericMapper<OptionVO, Long>{
	public void insertOptionList(ProductDetailVO vo);
}
