package br.com.acme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.db.Cliente;
import br.comum.CrudAbstract;

@RestController
@RequestMapping("api/cliente")
public class ClienteController extends CrudAbstract<Cliente, Integer> {

	@Override
	protected List<Cliente> lista() {
		return null;
	}

}
