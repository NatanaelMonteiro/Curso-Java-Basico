package br.com.natanael.aula25;

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
	
}
