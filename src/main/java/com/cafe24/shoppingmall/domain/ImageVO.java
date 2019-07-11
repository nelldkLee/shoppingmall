package com.cafe24.shoppingmall.domain;

import java.util.List;

import lombok.Data;

@Data
public class ImageVO {
	private Long no;
	private Long productNo;
	private List<String> imagePath;
}
