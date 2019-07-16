package com.cafe24.shoppingmall.service;

import java.util.List;

import com.cafe24.shoppingmall.domain.Criteria;

public interface GenericService<T, K> {

	public void register(T vo);

	public T view(K key);

	public void modify(T vo);

	public void remove(K key);

	public List<T> getList(Criteria cri);
	
	public int getTotal(Criteria cri);

}