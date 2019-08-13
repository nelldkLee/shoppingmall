package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class BasketVO {
	private Long basketNo;
	private Long memberNo;
	private String sessionId;
	private Long itemNo;
	private int count;
	private String productName;
	private Long price;
	private String mainImagePath;
	private ItemVO itemVo;
}
