package br.com.natanael.aula52;

public class DivisaoNaoExata extends Exception {

	private int num;
	private int dem;

	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}
	
	@Override
	public String toString() {
		return "Resultado de " + num + "/" + dem + " n�o � um inteiro";
	}
}
