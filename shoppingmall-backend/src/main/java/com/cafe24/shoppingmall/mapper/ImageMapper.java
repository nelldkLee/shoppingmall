package com.cafe24.shoppingmall.mapper;

import com.cafe24.shoppingmall.domain.ImageVO;
import com.cafe24.shoppingmall.domain.ProductVO;

public interface ImageMapper extends GenericMapper<ImageVO, Long>{
	public int insertImageList(ProductVO vo);
}
