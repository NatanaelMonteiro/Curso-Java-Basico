package br.com.natanael.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);
		  
		 /* System.out.println("Insira sua idade ");
		 * 
		 * int idade = scan.nextInt();
		 * 
		 * if (idade >= 18) { System.out.println("É maior de idade."); } else {
		 * System.out.println("É menor de idade."); }
		 */
		
		//valor <= 10 --- barato
		//valor entre 10 e 15 --- pechinchar
		//valor entre 15 e 17 --- pesquisar outros lugares
		//valor >= 17 --- muito caro
		
		System.out.println("Quanto custa amigo? ");
		double preço = scan.nextDouble();
		
		if (preço <= 10) {
			System.out.println("Uma bagatela, vo comprar!");
		} else if (preço > 10 && preço < 15) {
			System.out.println("Coé, dá um desconto ae!");
		} else if (preço >= 15 && preço < 17) {
			System.out.println("Hmm, vo dar mais uma voltinha");
		} else {
			System.out.println("Oxi, ta doido é?");
		}
		
}
}
