package com.acme;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acme.db.Cliente;
import comum.CrudAbstract;

@Controller
@EnableAutoConfiguration
@RequestMapping("api/Cliente")
public class ClienteController extends CrudAbstract<Cliente> {

	@Override
	protected List<Cliente> lista() {
		// TODO Auto-generated method stub
		return null;
	}
}
