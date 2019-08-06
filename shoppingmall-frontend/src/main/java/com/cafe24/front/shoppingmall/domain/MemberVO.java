package com.cafe24.front.shoppingmall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	
	private Long memberNo;
	private String id;
	private String memberName;
	private String password;
	private String email;
    private String telephone;
    private String sessionId;
    private String gender;
	private Date regDate;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
	
	public boolean isMember() {
		return sessionId == null ? true : false;
	}
}
