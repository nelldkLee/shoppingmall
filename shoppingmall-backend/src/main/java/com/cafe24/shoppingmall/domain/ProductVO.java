package com.cafe24.shoppingmall.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ProductVO {

	private Long productNo;
	private String productName;
	private String description;
	private int price;
	private boolean displayActive;
	private boolean sellingActive;
	private boolean optionActive;
	private String mainImagePath;
	private List<CategoryVO> categoryList;
	private List<ItemVO> itemList;
	private List<ImageVO> imageList;
	private Date regdate;
}
