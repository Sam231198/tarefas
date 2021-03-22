package com.model;

import javax.persistence.Entity;

@Entity
public class Task {

	private int id;
	private String titilo;
	private String detalhe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitilo() {
		return titilo;
	}

	public void setTitilo(String titilo) {
		this.titilo = titilo;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

}
