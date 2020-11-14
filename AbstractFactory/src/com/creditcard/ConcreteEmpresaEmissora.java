package com.creditcard;

public class ConcreteEmpresaEmissora extends EmpresaEmissora {

	public CartaoCredito emitirCartaoCredito(String nome, int limite) {
		return new ConcreteCartaoCredito(nome, limite);
	}

	public CartaoDebito emitirCartaoDebito(String nome, int conta) {
		return new ConcreteCartaoDebito(nome, conta);
	}

}
