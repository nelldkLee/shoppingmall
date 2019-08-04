package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class OrderItemVO {
	private Long orderItemNo;
	private Long itemNo;
	private Long orderNo;
	private int count;
	private int price;
}
