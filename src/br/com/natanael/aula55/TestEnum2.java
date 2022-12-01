package br.com.natanael.aula55;

import br.com.natanael.aula53.DiaSemana;

public class TestEnum2 {

	public static void main(String[] args) {

		DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
	}

}
