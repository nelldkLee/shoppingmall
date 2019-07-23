package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class ProductVO {

	private Long productNo;
	private String productName;
	private String description;
	private int price;
	private boolean display;
	private boolean selling;
	private ProductDetailVO productDetail;
}
