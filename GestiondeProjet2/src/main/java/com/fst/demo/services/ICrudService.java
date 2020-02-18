package com.fst.demo.services;

import java.util.List;



public interface ICrudService<T,E> {

	T add(T t);
	T update(T t);
	T getOne(E id);
	List<T> findAll();
	void delete(E id);
	
	
}