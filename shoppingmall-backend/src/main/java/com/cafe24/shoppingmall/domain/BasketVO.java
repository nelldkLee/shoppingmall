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
	private Long subTotalPrice;
	private String mainImagePath;
	private ItemVO itemVo;
	
	public void makeItemDescripion(List<ItemVO> itemList) {
		itemList.forEach((itemVO)->{
			if(itemNo == itemVO.getItemNo()) {
				itemVo.setOptionDescription(itemVO.getOptionDescription());
			}
		});
	}
	public Long getSubTotalPrice() {
		return count * price;
	}

}
