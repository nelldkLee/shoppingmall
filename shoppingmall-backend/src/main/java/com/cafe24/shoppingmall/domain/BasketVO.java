package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class BasketVO {
	private Long basketNo;
	private Long memberNo;
	private String sessionId;
	private Long itemNo;
	private int count;
	private ItemVO itemVo;
}
