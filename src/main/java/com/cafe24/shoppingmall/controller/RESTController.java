package com.cafe24.shoppingmall.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.cafe24.shoppingmall.dto.JSONResult;

public interface RESTController<T, K> {

	@GetMapping("s/")
	public JSONResult list() throws Exception;
	
	@GetMapping("/{no}")
	public JSONResult view(@PathVariable(value="no") K key) throws Exception;
	
	@PostMapping("/")
	public JSONResult register(T vo);
	
	@PutMapping("/{no}")
	public JSONResult modify(@PathVariable(value="no") K key, T vo) throws Exception;
	
	@DeleteMapping("/{no}")
	public JSONResult remove(@PathVariable(value="no") K key) throws Exception;

}
