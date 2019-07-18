package com.cafe24.shoppingmall.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT now()")  
	public String getTime();
	
	public String getTime2();
}
