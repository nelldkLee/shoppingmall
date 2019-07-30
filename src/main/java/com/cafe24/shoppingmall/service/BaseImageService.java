package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ImageVO;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.mapper.ImageMapper;

public class BaseImageService implements ImageService{

	@Autowired
	private ImageMapper mapper;
	
	@Override
	public void insert(ImageVO vo) {
		mapper.insert(vo);
	}

	@Override
	public ImageVO read(Long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ImageVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ImageVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertImageList(ProductVO vo) {
		mapper.insertImageList(vo);
	}
	

}
