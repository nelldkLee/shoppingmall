package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class ProductVO {

	private Long productNo;
	private Long categoryNo;
	private String productName;
	private String description;
	private int price;
	private boolean display;
	private boolean selling;
	private String thumnailPath;
	private List<ProductDetailVO> productDetailList;
	
}
