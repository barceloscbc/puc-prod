package br.comum;

import java.util.List;

public interface CrudInterface<T,Key> {
	void create(T entity);
	void update(T entity);
	void delete(Key id);
	T retrieve(Key id);
	List<T> listAll();
}
