package br.com.natanael.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);
		  
		 /* System.out.println("Insira sua idade ");
		 * 
		 * int idade = scan.nextInt();
		 * 
		 * if (idade >= 18) { System.out.println("� maior de idade."); } else {
		 * System.out.println("� menor de idade."); }
		 */
		
		//valor <= 10 --- barato
		//valor entre 10 e 15 --- pechinchar
		//valor entre 15 e 17 --- pesquisar outros lugares
		//valor >= 17 --- muito caro
		
		System.out.println("Quanto custa amigo? ");
		double pre�o = scan.nextDouble();
		
		if (pre�o <= 10) {
			System.out.println("Uma bagatela, vo comprar!");
		} else if (pre�o > 10 && pre�o < 15) {
			System.out.println("Co�, d� um desconto ae!");
		} else if (pre�o >= 15 && pre�o < 17) {
			System.out.println("Hmm, vo dar mais uma voltinha");
		} else {
			System.out.println("Oxi, ta doido �?");
		}
		
}
}
