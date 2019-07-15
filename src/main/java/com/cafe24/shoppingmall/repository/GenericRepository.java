package com.cafe24.shoppingmall.repository;

import java.util.List;

import com.cafe24.shoppingmall.domain.Criteria;

public interface GenericRepository<T, K> {

	public int insert(T vo) throws Exception;

	public T read(K key) throws Exception;

	public int update(T vo) throws Exception;

	public int delete(K key) throws Exception;

	public List<T> getList(Criteria cri) throws Exception;

}