package br.com.acme.model.repository;

import org.springframework.stereotype.Component;

import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Amigo;
import br.com.acme.model.entity.AmigoPK;

@Component
public class AmigoRespository extends RepositoryAbstract<Amigo, AmigoPK> {

}
