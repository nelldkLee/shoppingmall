package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ProductDetailVO;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.mapper.OptionMapper;
import com.cafe24.shoppingmall.mapper.ProductMapper;

@Service
@Transactional
public class BaseProductService implements ProductService{

	@Autowired
	private ProductMapper mapper;
	@Autowired
	private OptionService optionService;
	
	@Override
	public void insert(ProductVO vo) {
		mapper.insert(vo);
		mapper.insertProductDetail(vo);
		ProductDetailVO productDetailVO = vo.getProductDetail();
		productDetailVO.getOptionGroupList().forEach((optionGroupVO)->{
			optionGroupVO.setProductDetailNo(productDetailVO.getProductDetailNo());
		});
		optionService.insertOptionGroupList(productDetailVO);
	}

	@Override
	public ProductVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(ProductVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);		
	}

	@Override
	public List<ProductVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
}
