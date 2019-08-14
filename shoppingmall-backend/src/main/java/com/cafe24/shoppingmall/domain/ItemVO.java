package com.cafe24.shoppingmall.domain;

import java.util.List;

import javax.validation.constraints.PositiveOrZero;

import com.cafe24.shoppingmall.util.ValidationMessage;

import lombok.Data;

@Data
public class ItemVO {
	private Long productNo;
	private Long itemNo;
	@PositiveOrZero(message = ValidationMessage.STOCK_PATTERN)
	private int stock;
	private String optionDescription;
	private List<OptionVO> optionList;
	
	public void makeOptionDescription() {
		StringBuilder builder = new StringBuilder();
		optionList.forEach((optionVO)->{
			builder.append(optionVO.getOptionName() + " : " + optionVO.getOptionValue() + " / ");
		});
		optionDescription = builder.toString().substring(0, builder.length() - 2);
		
	}
}
