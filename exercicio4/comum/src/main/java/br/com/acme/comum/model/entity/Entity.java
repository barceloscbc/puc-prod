package br.com.acme.comum.model.entity;

public interface Entity<Key> {
	Key getId();

	void setId(Key id);
}
