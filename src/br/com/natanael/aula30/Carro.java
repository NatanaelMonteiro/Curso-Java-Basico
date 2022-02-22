package br.com.natanael.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double potencia;
	double tanqueCombustivel;
	double autonomia;
	
		
	public Carro(String marca, String modelo, int numPassageiros, double potencia, double tanqueCombustivel,
			double autonomia) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.potencia = potencia;
		this.tanqueCombustivel = tanqueCombustivel;
		this.autonomia = autonomia;
	}

	public Carro() {

	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("chamando o construtor com 3 parametros");

	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 5);
		System.out.println("chamando o construtor com 2 parametros");
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
