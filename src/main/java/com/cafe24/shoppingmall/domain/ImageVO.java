package com.cafe24.shoppingmall.domain;

import lombok.Data;

@Data
public class ImageVO {
	private Long productImageNo;
	private Long productNo;
	private int imageOrder;
	private String imagePath;
}
