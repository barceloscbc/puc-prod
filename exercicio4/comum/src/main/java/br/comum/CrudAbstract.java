package br.comum;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class CrudAbstract<T, Key> implements CrudInterface<T, Key> {
	protected abstract List<T> lista();

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(T entity) {
		// TODO Auto-generated method stub

	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(T entity) {
		// TODO Auto-generated method stub

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable("id") Key id) {
		// TODO Auto-generated method stub

	}

	@RequestMapping(value = "/retrieve/{id}", method = RequestMethod.GET, produces = "application/json")
	public T retrieve(@PathVariable("id") Key id) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/listAll", produces = "application/json")
	public List<T> listAll() {
		return null;
	}

}
