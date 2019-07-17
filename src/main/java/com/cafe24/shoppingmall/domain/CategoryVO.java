package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class CategoryVO {
	private Long categoryNo;
	private String categoryName;
	private Long upperCategoryNo;
}
