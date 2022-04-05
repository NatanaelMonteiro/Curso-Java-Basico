package br.com.natanael.aula47;

public class Excecao {
	
	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			System.out.println("Este txt n será impresso");
			
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessa um indice do vetor n existente");
		}
		
		System.out.println("Este txt será impresso apos a exception");
	}

}
