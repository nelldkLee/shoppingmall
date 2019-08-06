package com.cafe24.shoppingmall.service;

import java.util.List;

import com.cafe24.shoppingmall.domain.Criteria;

public interface GenericService<T, K> {

	public void insert(T vo);

	public T read(K key);

	public void update(T vo);

	public void delete(K key);

	public List<T> getList(Criteria cri);
	
	public int getTotal(Criteria cri);

}