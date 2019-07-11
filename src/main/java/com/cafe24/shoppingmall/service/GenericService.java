package com.cafe24.shoppingmall.service;

import java.util.List;

import com.cafe24.shoppingmall.domain.Criteria;

public interface GenericService<T, K> {

	public void register(T vo) throws Exception;

	public T view(K key) throws Exception;

	public void modify(T vo) throws Exception;

	public void remove(K key) throws Exception;

	public List<T> getList(Criteria cri) throws Exception;
	
	public int getTotal(Criteria cri) throws Exception;

}