package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class BasketVO {
	private Long basketNo;
	private Long memberNo;
	private Long productDetailNo;
	private int count;
}
