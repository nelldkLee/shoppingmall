package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class ProductVO {

	private Long productNo;
	private String productName;
	private String description;
	private int price;
	private boolean displayActive;
	private boolean sellingActive;
	private boolean optionActive;
	private List<CategoryVO> categoryList;
	private List<ProductDetailVO> productDetailList;
}
