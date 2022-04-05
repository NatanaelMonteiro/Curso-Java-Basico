package br.com.natanael.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa line é impressa sempre após o try ou catch");
				System.out.println();
			}
		}
		
	}

}
