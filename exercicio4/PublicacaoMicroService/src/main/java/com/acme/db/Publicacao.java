package com.acme.db;

import java.util.Date;

import comum.Entity;

public class Publicacao implements Entity {

	private Integer id;
	private String nome;
	private Date dataPublicacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public Object getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

}
