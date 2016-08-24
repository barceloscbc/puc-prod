package comum;

import java.util.List;

public interface CrudInterface<T> {
	void create(T entity);
	void update(T entity);
	void delete(Integer id);
	T retrieve(Integer id);
	List<T> listAll();
}
