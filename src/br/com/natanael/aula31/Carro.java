package br.com.natanael.aula31;

public class Carro {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double potencia;
	public double tanqueCombustivel;
	public double autonomia;
	
	/*
	 * public Carro(String marca, String modelo, int numPassageiros, double
	 * potencia, double tanqueCombustivel, double autonomia) { this.marca = marca;
	 * this.modelo = modelo; this.numPassageiros = numPassageiros; this.potencia =
	 * potencia; this.tanqueCombustivel = tanqueCombustivel; this.autonomia =
	 * autonomia; }
	 * 
	 * public Carro() {
	 * 
	 * }
	 * 
	 * public Carro(String marca, String modelo, int numPassageiros) { this.marca =
	 * marca; this.modelo = modelo; this.numPassageiros = numPassageiros;
	 * System.out.println("chamando o construtor com 3 parametros");
	 * 
	 * }
	 * 
	 * public Carro(String marca, String modelo) { this(marca, modelo, 5);
	 * System.out.println("chamando o construtor com 2 parametros"); }
	 */	
		
	void exibirAutonomia() {
		System.out.println("O carro rodará: " + this.tanqueCombustivel * this.autonomia + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("obterAutonomia foi chamado.");
		
		return this.tanqueCombustivel * this.autonomia;
	
	}
	
	private double divideKmAutonomia(double km) {
		
		return km/this.autonomia;
		
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKmAutonomia(km);
		
	}
	
}
