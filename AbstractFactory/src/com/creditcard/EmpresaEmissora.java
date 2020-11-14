package com.creditcard;

public abstract class EmpresaEmissora {
	
	public abstract CartaoCredito emitirCartaoCredito(String nome, int limite); 
	
	public abstract CartaoDebito emitirCartaoDebito(String nome, int conta); 
	
}
