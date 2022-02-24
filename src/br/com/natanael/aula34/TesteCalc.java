package br.com.natanael.aula34;

public class TesteCalc {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MinhaCalc.soma(1, 2);

		/*
		 * MinhaCalc calc = new MinhaCalc();
		 * 
		 * int soma1 = calc.soma(1, 2);
		 * 
		 * System.out.println(soma1);
		 * 
		 * int soma2 = calc.soma(1, 2, 3);
		 * 
		 * System.out.println(soma2);
		 */
		
		soma2Valores(1, 2);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalc.soma(num1, num2);
	}

}
