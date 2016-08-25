package br.com.acme.comum.controller;

import java.util.List;

public interface CrudInterface<T, Key> {
	void create(T entity) throws Exception;

	void update(T entity) throws Exception;

	void delete(Key id) throws Exception;

	T retrieve(Key id) throws Exception;

	List<T> listAll() throws Exception;
}
