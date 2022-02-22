package br.com.natanael.aula32;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double potencia;
	private double tanqueCombustivel;
	private double autonomia;

	/*
	 * public String getMarca() { return this.marca; }
	 * 
	 * public void setMarca(String marca) { this.marca = marca; }
	 * 
	 * public String getModelo( ) { return this.modelo; }
	 * 
	 * public void setModelo(String modelo) { this.modelo = modelo; }
	 * 
	 * public int getNumPassageiros( ) { return this.numPassageiros; }
	 * 
	 * public void setNumPassageiros (int numPassageiros) { this.numPassageiros =
	 * numPassageiros; }
	 */			//Feito manualmente//
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getTanqueCombustivel() {
		return tanqueCombustivel;
	}
	public void setTanqueCombustivel(double tanqueCombustivel) {
		this.tanqueCombustivel = tanqueCombustivel;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	} 	//feito automaticamente//
}
