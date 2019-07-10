package com.cafe24.shoppingmall.vo;

import lombok.Data;

@Data
public class Criteria {
	
	private int page;
	private String type;
	private String keyword;
	
	public void setPage(int page) {
		this.page = page < 0 ? 1 : page;
	}
}
