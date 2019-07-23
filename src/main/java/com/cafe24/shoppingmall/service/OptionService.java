package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.OptionVO;
import com.cafe24.shoppingmall.domain.ProductDetailVO;

public interface OptionService extends GenericService<OptionVO, Long>{
	public void insertOptionGroupList(ProductDetailVO vo);
}
