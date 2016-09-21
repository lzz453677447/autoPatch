package org.andy.work.dao;

import java.io.Serializable;
import java.util.List;

/**
 * ����ʱ�䣺2015-2-6 ����2:26:42
 * 
 * @author andy
 * @version 2.2
 * 
 * Daoͨ�ýӿ�
 */

interface GenericDao<T, PK extends Serializable> {
	
	T load(PK id);
	
	T get(PK id);
	
	List<T> findAll();
	
	void persist(T entity);
	
	PK save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(PK id);
	
	void flush();
}