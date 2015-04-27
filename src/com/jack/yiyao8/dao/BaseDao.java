package com.jack.yiyao8.dao;


public interface BaseDao<T> {

	long insert(T t);
	int delete(long id);
}
