package br.com.acme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.comum.controller.CrudAbstractController;
import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Publicacao;
import br.com.acme.model.repository.PublicacaoRepository;

@RestController
@RequestMapping("api/publicacao")
public class PublicacaoController extends CrudAbstractController<Publicacao, Integer> {

	@Autowired
	private PublicacaoRepository repository;

	@Override
	protected RepositoryAbstract<Publicacao, Integer> getRepository() {
		return repository;
	}

}
