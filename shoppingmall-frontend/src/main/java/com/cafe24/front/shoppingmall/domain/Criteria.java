package com.cafe24.front.shoppingmall.domain;

import lombok.Data;

@Data
public class Criteria {
	
	private int page;
	private String type;
	private String keyword;
	private Long memberNo;
	private String sessionId;
	private int perPageSize;
	private Long productNo;
	private Long itemNo;
	
	public Criteria() {
		this.page = 1;
	}
	public Criteria setSessionId(String sessionId) {
		this.sessionId = sessionId;
		return this;
	}
	public Criteria setItemNo(Long itemNo) {
		this.itemNo = itemNo;
		return this;
	}
	
	public void setPage(int page) {
		this.page = page < 0 ? 1 : page;
	}
	public int getLimitStart() {
		return (this.page-1) * PageMaker.PER_PAGE_SIZE;
	}
	
	public void setPerPageSize(int perPageSize) {
		this.perPageSize = perPageSize < 0 ? PageMaker.PER_PAGE_SIZE : perPageSize; 
	}
	
	public int getPerPageSize() {
		return perPageSize == 0 ? PageMaker.PER_PAGE_SIZE : perPageSize;
	}

	public boolean isMember() {
		return memberNo != null ? true:false;
	}
	
	public String makeURL() {
		StringBuilder builder = new StringBuilder();

		builder.append("?page=");
		builder.append(page);

		if (type != null) {
			builder.append("&");
			builder.append("type=");
			builder.append(type);
		}
		if (keyword != null) {
			builder.append("&");
			builder.append("keyword=");
			builder.append(keyword);
		}
		if (memberNo != null) {
			builder.append("&");
			builder.append("memberNo=");
			builder.append(memberNo);
		}
		if (sessionId != null) {
			builder.append("&");
			builder.append("sessionId=");
			builder.append(sessionId);
		}
		if (itemNo != null) {
			builder.append("&");
			builder.append("itemNo=");
			builder.append(itemNo);
		}
		System.out.println("make Url");
		return builder.toString();
	}

	
}
