package br.com.natanael.aula44;

public class Cachorro extends Mamifero implements AnimalEsimacao, AnimalDomesticado {

	private String tamanho;
	private String raca;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void amamentar() {
	}
	public void emitirSom() {
	}
	public void levarVet() {
	}
	public void alimentar() {
	}
	public void brincar() {
	}
	public void passear() {
	}
	
}
