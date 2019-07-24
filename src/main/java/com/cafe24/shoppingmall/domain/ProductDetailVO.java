package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class ProductDetailVO {
	private Long productNo;
	private Long productDetailNo;
	private int stock;
	private List<OptionVO> optionList;
}
