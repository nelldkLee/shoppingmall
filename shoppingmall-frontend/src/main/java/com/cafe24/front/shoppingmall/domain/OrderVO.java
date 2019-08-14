package com.cafe24.front.shoppingmall.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrderVO {
	
	private Long orderNo;
	private Long memberNo;
	private String sessionId;
	private String progress;
	private String orderPassword;
	private String productName;
	
	private	String receiverName;
	private	String receiverTelephone;
	private String receiverZipcode;
	private String receiverNormalAddress;
	private String receiverExtendAddress;
	
	
	private int totalPrice;
	private Date regdate;
	private List<OrderItemVO> orderItemList;
	
	public int getTotalPrice() {
		orderItemList.forEach((orderItem)->{
			totalPrice += orderItem.getPrice() * orderItem.getCount();
		});
		return totalPrice;
	}
	public boolean isMember() {
		return sessionId == null ? true : false;
	}
}
