package br.com.acme.model.repository;

import org.springframework.stereotype.Component;

import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Cliente;

@Component
public class ClienteRespository extends RepositoryAbstract<Cliente, Integer> {

}
