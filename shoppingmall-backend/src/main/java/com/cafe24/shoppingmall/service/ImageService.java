package com.cafe24.shoppingmall.service;

import com.cafe24.shoppingmall.domain.ImageVO;
import com.cafe24.shoppingmall.domain.ProductVO;

public interface ImageService extends GenericService<ImageVO, Long>{
	public void insertImageList(ProductVO vo);
}
