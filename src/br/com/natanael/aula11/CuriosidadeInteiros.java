package br.com.natanael.aula11;

public class CuriosidadeInteiros {

	public static void main(String[] args) {
		
		int var1 = 2147483647; //2147483647 maior int positivo, -2147483648 menor int negativo.
		
		int var2 = 1;
		
		int var3 = 2147483647;
		
		Integer i = Integer.MIN_VALUE; // Integer é um objeto, e não um primitivo.
		
		
		System.out.println(var1 + var2);
		System.out.println(var1 + var2 + var3);
		System.out.println(i);
	}
	

}
