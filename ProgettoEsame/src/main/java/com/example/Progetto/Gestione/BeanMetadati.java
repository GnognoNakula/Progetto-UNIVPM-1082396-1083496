package com.example.Progetto.Gestione;


import java.io.Serializable;


/**
 * Classe Bean relativa agli attributi degli oggetti all'interno del file csv, composta da costruttore, setters and 
 * getters ed il metodo toString()
 * 
 */
public class BeanMetadati implements Serializable{
	public static final long serialVersionUID = 1; 
	private String nome;
	private String tipo;
	
	
	public BeanMetadati(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "BeanMetadati [nome=" + nome + ", tipo=" + tipo + "]";
	}

	
}
