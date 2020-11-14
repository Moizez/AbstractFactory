package com.creditcard;

public class ConcreteCartaoDebito extends CartaoDebito {

	public ConcreteCartaoDebito(String nome, int conta) {
		super(nome, conta);
	}

	public void exibeDetalhes() {
		System.out.println("Cartão de débito emitodo para o cliente: " + this.getNome() + 
				" com a conta de número " + this.getConta());
	}
}
