package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cafe24.shoppingmall.controller.GenericRESTController;
import com.cafe24.shoppingmall.domain.CategoryVO;
import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.dto.JSONResult;

public class TestCategoryController implements GenericRESTController<CategoryVO>{

	
	@Override
	public JSONResult list(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult view(@PathVariable(value="key") Long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult register(@RequestBody CategoryVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult modify(@RequestBody CategoryVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult remove(@PathVariable(value="") Long no) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
