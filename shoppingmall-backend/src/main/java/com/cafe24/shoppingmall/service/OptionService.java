package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.OptionVO;
import com.cafe24.shoppingmall.domain.ProductVO;

public interface OptionService extends GenericService<OptionVO, Long>{
	public void insertOptionList(ProductVO vo);
}
