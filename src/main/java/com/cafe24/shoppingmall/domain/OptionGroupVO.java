package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class OptionGroupVO {
	private Long optionGroupNo;
	private int price;
	private int stock;
	private List<OptionVO> optionList;
}
