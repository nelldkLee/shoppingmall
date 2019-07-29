package com.cafe24.shoppingmall.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.domain.MemberVO;
import com.cafe24.shoppingmall.exception.ValidCustomException;
import com.cafe24.shoppingmall.mapper.MemberMapper;
import com.cafe24.shoppingmall.util.ValidationMessage;


@Service
public class BaseMemberService implements MemberService{

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private BasketService basketService;
	
	@Override
	public void insert(MemberVO vo) {
		mapper.insert(vo);
	}

	@Override
	public MemberVO read(Long key) {
		return mapper.read(key);
	}

	@Override
	public void update(MemberVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(Long key) {
		mapper.delete(key);
	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		return mapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

	@Override
	public void verifyDuplicateId(String id) {
		checkValidCustomException(mapper.findById(id).isPresent(), ValidationMessage.ID_DUPLICATED, ValidationMessage.ID_FIELD);
	}

	/*
	 * 	parameter : MemberVO(sessionId, id, password)
	 *  sessionId를 가져오는 이유 : 장바구니 상품 추가 해주기 위해
	 */
	@Override
	public MemberVO login(MemberVO vo) {
		Optional<MemberVO> optionalMemberVO = mapper.findByIdAndPassword(vo);
		
		checkValidCustomException(!optionalMemberVO.isPresent(), ValidationMessage.ID_PW_WRONG, ValidationMessage.ID_PW_FIELD);
		// DB에서 회원 데이터를 가져옴
		MemberVO memberVO = optionalMemberVO.get();
		memberVO.setSessionId(vo.getSessionId());
		checkBasketAddedProduct(memberVO);
		
		return memberVO;
	}

	private void checkValidCustomException(boolean check, String message, String field) {
		if(check) {
			throw new ValidCustomException(message, field);
		}
	}

	private void checkBasketAddedProduct(MemberVO vo) {
		List<BasketVO> basketList = basketService.getList(new Criteria().setSessionId(vo.getSessionId()));
		
		if(!basketList.isEmpty()) {
			basketList.forEach((basketVO)->{
				basketVO.setMemberNo(vo.getMemberNo());
				basketService.insert(basketVO);
			});
			basketService.deleteBasketsByMember(vo);
		}
	}
	
}
