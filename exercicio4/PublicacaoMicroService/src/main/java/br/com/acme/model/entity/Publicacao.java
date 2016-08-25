package br.com.acme.model.entity;

import java.util.Date;

import br.com.acme.comum.model.entity.Entity;

public class Publicacao implements Entity<Integer> {

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
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

}
