package br.com.acme.model.entity;

import java.util.Date;

import br.com.acme.comum.model.entity.Entity;

public class Emprestimo implements Entity<Integer> {
	private Integer id;
	private Integer codigoCliente;
	private Integer codigoPublicacao;
	private Date dataEmprestimo;
	private Date dataDevolução;

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Integer getCodigoPublicacao() {
		return codigoPublicacao;
	}

	public void setCodigoPublicacao(Integer codigoPublicacao) {
		this.codigoPublicacao = codigoPublicacao;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolução() {
		return dataDevolução;
	}

	public void setDataDevolução(Date dataDevolução) {
		this.dataDevolução = dataDevolução;
	}

}
