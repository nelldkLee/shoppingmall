package com.cafe24.front.shoppingmall.domain;

import lombok.Data;

@Data
public class PageMaker {

	private int start, end, totalCount;
	private boolean prev, next;
	private Criteria cri;
	// 한페이지에 보여지는 게시글의 수
	public static final int PER_PAGE_SIZE = 12;
	
	public PageMaker(Criteria cri, int totalCount) {
		this.cri = cri;
		this.totalCount = totalCount;
		int endPage = (int) Math.ceil(this.totalCount / PER_PAGE_SIZE);
		this.cri.setPage(cri.getPage() > endPage ? endPage : cri.getPage());
		setUp();
	}

	private void setUp() {
		end = ((cri.getPage() - 1) / 10) * 10 + 10;
		start = end - 9;
		if (totalCount < end * PER_PAGE_SIZE) {
			end = (int) (totalCount / PER_PAGE_SIZE) + 1;
		}
		prev = start != 1 ? true : false;
		next = end * PER_PAGE_SIZE <= totalCount ? true : false;
		
	}

}