package com.cafe24.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.ItemVO;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.mapper.BasketMapper;
import com.cafe24.shoppingmall.mapper.ItemMapper;

@Service
public class BaseBasketService implements BasketService{

	@Autowired
	private BasketMapper mapper;
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public void insert(BasketVO vo) {
		isDuplicatedProduct(vo);
	}
	
	@Override
	public void insertList(List<BasketVO> basketList) {
		basketList.forEach((basketVO)->{
			insert(basketVO);
		});
	}
	@Override
	public BasketVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(BasketVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);		
	}

	@Override
	public List<BasketVO> getList(Criteria cri) {
		List<BasketVO> basketList = mapper.getList(cri);
		basketList.forEach(basketVO->{
			ItemVO itemVO = itemMapper.read(basketVO.getItemNo());
			itemVO.makeOptionDescription();
			basketVO.getItemVo().setOptionDescription(itemVO.getOptionDescription());
		});
		
		return basketList;
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
	
	@Override
	public void isDuplicatedProduct(BasketVO vo) {
		Criteria cri = new Criteria();
		cri.setItemNo(vo.getItemNo());

		if(vo.getMemberNo() != null) {
			cri.setMemberNo(vo.getMemberNo());
		}else {
			cri.setSessionId(vo.getSessionId());
		}
		List<BasketVO> list =  mapper.getList(cri);
		// 기존에 장바구니에 같은 상품 담겨있을 시 수량 더해주기.
		if(list.size() > 0) {
			vo.setCount(list.get(0).getCount() + vo.getCount());
			mapper.update(vo);
		// 장바구니에 없으면 장바구니에 상품추가
		} else {
			mapper.insert(vo);
		}
	}
	@Override
	public void deleteBasketsByMember(MemberVO vo) {
		
		if(vo.isMember()) {
			mapper.deleteByMemberNo(vo.getMemberNo());
		}else {
			mapper.deleteBySessionId(vo.getSessionId());
		}
	}

	@Override
	public void deleteBasketByItemNo(Long itemNo) {
		mapper.deleteByItemNo(itemNo);
	}
}
