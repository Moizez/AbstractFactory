package com.creditcard;

public abstract class CartaoDebito {
	private String nome;
	private int conta;

	public CartaoDebito(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public abstract void exibeDetalhes();

}
