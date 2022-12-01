package br.com.natanael.aula55;

import br.com.natanael.aula54.DiaSemana;

public class TestEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();
		
/*		for (int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
*/		
		for (DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);	
		}
		
	}

}
