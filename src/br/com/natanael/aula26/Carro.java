package br.com.natanael.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double potencia;
	double tanqueCombustivel;
	double autonomia;
	
	void exibirAutonomia() {
		System.out.println("O carro rodar�: " + tanqueCombustivel * autonomia + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("obterAutonomia foi chamado: ");
		
		return tanqueCombustivel * autonomia;
	}
}
