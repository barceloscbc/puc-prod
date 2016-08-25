package br.com.acme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Emprestimo;
import br.com.acme.model.repository.EmprestimoRespository;

@RestController
@RequestMapping("api/emprestimo")
public class EmprestimoController {

	@RequestMapping(value = "/emprestar", method = RequestMethod.POST)
	public void create(@RequestBody Emprestimo entity) throws Exception {
		getRepository().add(entity);
	}

	@RequestMapping(value = "/devolver", method = RequestMethod.POST)
	public void update(@RequestBody Emprestimo entity) throws Exception {
		getRepository().update(entity);
	}

	@Autowired
	private EmprestimoRespository repository;

	protected RepositoryAbstract<Emprestimo, Integer> getRepository() {
		return repository;
	}

}
