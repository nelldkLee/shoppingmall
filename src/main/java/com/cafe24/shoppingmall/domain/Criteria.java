package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class Criteria {
	
	private int page;
	private String type;
	private String keyword;
	private Long memberNo;
	private String sessionId;
	private Long productDetailNo;
	
	public Criteria() {
		this.page = 1;
	}
	public Criteria setSessionId(String sessionId) {
		this.sessionId = sessionId;
		return this;
	}
	public Criteria setProductDetailNo(Long productDetailNo) {
		this.productDetailNo = productDetailNo;
		return this;
	}
	
	public void setPage(int page) {
		this.page = page < 0 ? 1 : page;
	}
	public int getLimitStart() {
		return (this.page-1) * PageMaker.PER_PAGE_SIZE;
	}
	public int getPerPageSize() {
		return PageMaker.PER_PAGE_SIZE;
	}

	public boolean isMember() {
		return memberNo > 0 ? true:false;
	}
}
