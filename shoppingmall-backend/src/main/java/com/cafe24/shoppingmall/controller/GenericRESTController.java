package com.cafe24.shoppingmall.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cafe24.shoppingmall.domain.Criteria;
import com.cafe24.shoppingmall.dto.JSONResult;

/*
 * RESTController 기본 규격 설정
 * 필요에 따라 parameter 어노테이션은 하위에서 재정의 하여 사용한다.
 * @PathVariable(value=""), @RequestBody
 */
public interface GenericRESTController<T> {

	@GetMapping
	public JSONResult list(Criteria cri);
	
	@GetMapping("/{key:(?!checkId).*}")
	public JSONResult view(Long no);//@PathVariable(value="")
	
	@PostMapping
	public JSONResult register(T vo);//@RequestBody
	
	@PutMapping
	public JSONResult modify(T vo);//@RequestBody
	
	@DeleteMapping("/{key}")
	public JSONResult remove(Long no);//@PathVariable(value="")

}
