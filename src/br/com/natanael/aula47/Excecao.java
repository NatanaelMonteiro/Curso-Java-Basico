package br.com.natanael.aula47;

public class Excecao {
	
	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			System.out.println("Este txt n ser� impresso");
			
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessa um indice do vetor n existente");
		}
		
		System.out.println("Este txt ser� impresso apos a exception");
	}

}
