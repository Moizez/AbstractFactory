package com.creditcard;

public class ConcreteCartaoCredito extends CartaoCredito {

	public ConcreteCartaoCredito(String nome, int limite) {
		super(nome, limite);
	}

	public void exibeDetalhes() {
		System.out.println("Cartão de crédito emitodo para: " + this.getNome() + 
				" com limite de " + this.getLimite() + " reais");
	}
}
