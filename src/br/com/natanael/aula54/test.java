package br.com.natanael.aula54;

public class test {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(28, 07, 1994, DiaSemana.QUINTA);
	}

}
