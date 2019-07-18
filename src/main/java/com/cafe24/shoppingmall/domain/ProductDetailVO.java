package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class ProductDetailVO {
	
	private Long productDetailNo;
	private List<OptionGroupVO> optionGroupList;
}
