package com.creditcard;

public abstract class CartaoCredito {

	private String nome;
	private int limite;

	public CartaoCredito(String nome, int limite) {
		this.nome = nome;
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public abstract void exibeDetalhes();

}
