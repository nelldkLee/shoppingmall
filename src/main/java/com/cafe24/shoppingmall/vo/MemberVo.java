package com.cafe24.shoppingmall.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVo {
	private String id;
	private String memberName;
	private String password;
	private String email;
	private String telephone;
	private Date birth;
	private Date regDate;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
}
