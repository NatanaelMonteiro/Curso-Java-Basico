package com.natanael.cursojavabasico.aula19;

public class Arrays {

	public static void main(String[] args) {

		double tempDia001 = 31.3;
		double tempDia002 = 31.5;
		double tempDia003 = 32.1;
		double tempDia004 = 34.5;
		double tempDia005 = 28.2;

		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 31.5;
		temperaturas[2] = 32.1;
		temperaturas[3] = 34.5;
		temperaturas[4] = 28.2;
		
		System.out.println("A temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas);
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturas[i]);

		}

		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}

}
