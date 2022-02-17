package br.com.natanael.aula27;

import br.com.natanael.aula27.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		Carro hatch0 = new Carro();
		hatch0.marca = "Peugeot";
		hatch0.modelo = "208";
		hatch0.numPassageiros = 5;
		hatch0.autonomia = 12.7;
		hatch0.tanqueCombustivel = 45;
		hatch0.potencia = 95;
		
		System.out.println(hatch0.marca);
		System.out.println(hatch0.modelo);
		System.out.println();
		
		hatch0.exibirAutonomia();
		
		double autonomia = hatch0.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + hatch0.obterAutonomia());
		
		double qtdCombustivel10 = hatch0.calcularCombustivel(10);
		double qtdCombustivel15 = hatch0.calcularCombustivel(15);

		System.out.println("qntCombustivel10 = " + qtdCombustivel10);
		System.out.println("qntCombustivel15 = " + qtdCombustivel15);
		
	}

}
