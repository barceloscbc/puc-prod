package br.com.acme.model.entity;

import br.com.acme.comum.model.entity.Entity;

public class Cliente implements Entity<Integer> {

	private Integer codigo;
	private String nome;
	private String cpf;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public Integer getId() {
		return codigo;
	}

	@Override
	public void setId(Integer id) {
		this.codigo = id;

	}
}
