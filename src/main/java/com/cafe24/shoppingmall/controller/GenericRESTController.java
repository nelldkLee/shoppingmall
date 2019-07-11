package com.cafe24.shoppingmall.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cafe24.shoppingmall.dto.JSONResult;

public interface GenericRESTController<T> {

	@GetMapping
	public JSONResult list() throws Exception;
	
	@GetMapping("/{key}")
	public JSONResult view(Long key) throws Exception;//@PathVariable(value="")
	
	@PostMapping
	public JSONResult register(T vo);//@RequestBody
	
	@PutMapping
	public JSONResult modify(T vo) throws Exception;//@RequestBody
	
	@DeleteMapping("/{key}")
	public JSONResult remove(Long key) throws Exception;

}
