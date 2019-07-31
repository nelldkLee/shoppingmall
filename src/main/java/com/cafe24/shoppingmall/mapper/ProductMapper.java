package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.ProductVO;

public interface ProductMapper extends GenericMapper<ProductVO, Long>{
	public int insertProductCategory(ProductVO vo);
}
