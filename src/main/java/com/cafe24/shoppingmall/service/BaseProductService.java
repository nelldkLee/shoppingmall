package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ItemVO;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.mapper.ItemMapper;
import com.cafe24.shoppingmall.mapper.ProductMapper;

@Service
public class BaseProductService implements ProductService{

	@Autowired
	private ProductMapper mapper;
	@Autowired
	private OptionService optionService;
	@Autowired
	private ImageService imageService;
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	@Transactional
	public void insert(ProductVO vo) {
		mapper.insert(vo);
		List<ItemVO> list = vo.getItemList();
		list.forEach((item)-> item.setProductNo(vo.getProductNo()));
		list.forEach((item)-> itemMapper.insert(item));
		checkOption(vo);
		checkCategory(vo);
		checkImage(vo);
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
	
	private void checkOption(ProductVO vo) {
		if(vo.isOptionActive()) {
			optionService.insertOptionList(vo);
		}
	}
	
	private void checkCategory(ProductVO vo) {
		if(vo.getCategoryList().size() > 0) {
			mapper.insertProductCategory(vo);
		}
	}

	private void checkImage(ProductVO vo) {
		if(vo.getImageList().size() > 0) {
			imageService.insertImageList(vo);
		}
	}

}
