package br.com.natanael.aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double potencia;
	double tanqueCombustivel;
	double autonomia;
	
	void exibirAutonomia() {
		System.out.println("O carro rodará: " + tanqueCombustivel * autonomia + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("obterAutonomia foi chamado.");
		
		return tanqueCombustivel * autonomia;
	
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/autonomia;
		
		return qtdCombustivel;
	}
	
}
