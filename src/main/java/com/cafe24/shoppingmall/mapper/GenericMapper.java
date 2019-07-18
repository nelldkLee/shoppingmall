package com.cafe24.shoppingmall.mapper;

import java.util.List;

import com.cafe24.shoppingmall.domain.Criteria;

public interface GenericMapper<T, K> {

	public int insert(T vo);

	public T read(K key);

	public int update(T vo);

	public int delete(K key);

	public List<T> getList(Criteria cri);
	
	public int getTotal(Criteria cri);

}