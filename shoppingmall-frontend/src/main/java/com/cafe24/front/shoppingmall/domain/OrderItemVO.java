package com.cafe24.front.shoppingmall.domain;
import lombok.Data;

@Data
public class OrderItemVO {
	private Long orderItemNo;
	private Long itemNo;
	private Long orderNo;
	private String productName;
	private String optionDescription;
	private int count;
	private int price;
	
}
