package com.cafe24.shoppingmall.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.dto.JSONResult;
import com.cafe24.shoppingmall.service.GenericService;

public abstract class AbstractRESTController<T, S extends GenericService> implements GenericRESTController<T>{
	
	@Autowired
	protected S service;

	@Override
	public JSONResult list(Criteria cri) {
		return JSONResult.success(service.getList(cri));
	}

	@Override
	public JSONResult view(@PathVariable(value="key") Long no) {
		return JSONResult.success(service.read(no));
	}

	@Override
	public JSONResult register(@Valid @RequestBody T vo) {
		service.insert(vo);
		return JSONResult.success(null);
	}

	@Override
	public JSONResult modify(@Valid @RequestBody T vo) {
		service.update(vo);
		return JSONResult.success(null);
	}

	@Override
	public JSONResult remove(@PathVariable(value="key") Long no) {
		service.delete(no);
		return JSONResult.success();
	}
	
	
}
