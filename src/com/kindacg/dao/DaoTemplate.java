package com.kindacg.dao;

import java.util.List;

public interface DaoTemplate<T> {
	public int save(T t)throws Exception;
	public int delete(T t)throws Exception;
	public int delete(int id)throws Exception;
	public int update(T t)throws Exception;
	public List<T> select()throws Exception;
	public T get(int id)throws Exception;
}
