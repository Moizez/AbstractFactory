package com.creditcard;

public class Main {

	public static void main(String[] args) {
		EmpresaEmissora caixa = new ConcreteEmpresaEmissora();

		CartaoCredito visa = caixa.emitirCartaoCredito("João Pereira", 5000);

		CartaoDebito debito = caixa.emitirCartaoDebito("Maria Joana", 12334434);

		visa.exibeDetalhes();
		debito.exibeDetalhes();
	}

}
