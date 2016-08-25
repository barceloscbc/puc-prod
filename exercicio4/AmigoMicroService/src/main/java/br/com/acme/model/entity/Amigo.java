package br.com.acme.model.entity;

import br.com.acme.comum.model.entity.Entity;

public class Amigo implements Entity<AmigoPK> {

	private AmigoPK id;

	@Override
	public AmigoPK getId() {
		return this.id;
	}

	@Override
	public void setId(AmigoPK id) {
		this.id = id;

	}

}
