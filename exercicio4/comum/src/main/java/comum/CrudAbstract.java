package comum;

import java.util.List;


public abstract class CrudAbstract<T> implements CrudInterface<T> {
	
	protected abstract List<T> lista();

	public void create(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public T retrieve(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
