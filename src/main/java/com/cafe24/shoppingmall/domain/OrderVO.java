package com.cafe24.shoppingmall.domain;

import java.util.Date;
import java.util.List;
import com.cafe24.shoppingmall.dto.Progress;
import lombok.Data;

@Data
public class OrderVO {
	private Long orderNo;
	private Long memberNo;
	private String sessionId;
	private Enum<Progress> progress;
	private	String receiveName;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
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
