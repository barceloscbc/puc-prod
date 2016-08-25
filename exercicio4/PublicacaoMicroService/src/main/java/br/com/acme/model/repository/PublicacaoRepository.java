package br.com.acme.model.repository;

import org.springframework.stereotype.Component;

import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Publicacao;

@Component
public class PublicacaoRepository extends RepositoryAbstract<Publicacao, Integer> {

}
