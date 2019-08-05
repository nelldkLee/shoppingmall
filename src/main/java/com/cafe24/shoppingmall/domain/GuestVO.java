package com.cafe24.shoppingmall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class GuestVO {
	
	private String sessionId;
	private String guestName;
	private String telephone;
	private Date regDate;
	
}
