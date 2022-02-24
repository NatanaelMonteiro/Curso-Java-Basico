package br.com.natanael.aula33;

public class TesteCalc {

	public static void main(String[] args) {

		MinhaCalc calc = new MinhaCalc();
	
		int soma1 = calc.soma(1, 2);
		
		System.out.println(soma1);
		
		int soma2 = calc.soma(1, 2, 3);
		
		System.out.println(soma2);
		
	}

}
