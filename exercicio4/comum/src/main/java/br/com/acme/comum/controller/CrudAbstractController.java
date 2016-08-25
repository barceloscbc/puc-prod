package br.com.acme.comum.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.acme.comum.model.entity.Entity;
import br.com.acme.comum.model.repository.RepositoryAbstract;

public abstract class CrudAbstractController<T extends Entity<Key>, Key> implements CrudInterface<T, Key> {
	protected abstract RepositoryAbstract<T, Key> getRepository();

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody T entity) throws Exception {
		getRepository().add(entity);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody T entity) throws Exception {
		getRepository().update(entity);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable("id") Key id) throws Exception {
		getRepository().delete(id);
	}

	@RequestMapping(value = "/retrieve/{id}", method = RequestMethod.GET, produces = "application/json")
	public T retrieve(@PathVariable("id") Key id) throws Exception {
		return getRepository().get(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/listAll", produces = "application/json")
	public List<T> listAll() throws Exception {
		return getRepository().getAll();
	}

}
