package br.com.natanael.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;
		
		boolean result1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 � 1 AND valor2 � 2 - resultado: " + result1);
		
		boolean result2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 � 1 OR valor2 � 2 - resultado: " + result2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		
	}

}
