package br.com.acme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.comum.controller.CrudAbstractController;
import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Cliente;
import br.com.acme.model.repository.ClienteRespository;

@RestController
@RequestMapping("api/cliente")
public class ClienteController extends CrudAbstractController<Cliente, Integer> {

	@Autowired
	private ClienteRespository repository;

	@Override
	protected RepositoryAbstract<Cliente, Integer> getRepository() {
		return repository;
	}

}
