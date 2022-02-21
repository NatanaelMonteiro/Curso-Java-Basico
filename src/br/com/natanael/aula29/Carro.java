package br.com.natanael.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double potencia;
	double tanqueCombustivel;
	double autonomia;
	
	Carro() {
		
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double potencia_, double tanqueCombustivel_, double autonomia_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		potencia = potencia_;
		tanqueCombustivel = tanqueCombustivel_;
		autonomia = autonomia_;
		
	}
		
	
	
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
