package br.com.natanael.aula56Teste;

public enum Operacoes {

	SOMAR("+"), SUBTRAIR("-"), MULTIPLICAR("*"), DIVIDIR("/");
	
	private String sinal;
	
	Operacoes(String sinal){
		this.sinal = sinal;
	}
	
	public String toString(){
		return this.sinal;
	}
}
