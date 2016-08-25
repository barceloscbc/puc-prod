package br.com.acme.model.repository;

import org.springframework.stereotype.Component;

import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Emprestimo;

@Component
public class EmprestimoRespository extends RepositoryAbstract<Emprestimo, Integer> {

}
