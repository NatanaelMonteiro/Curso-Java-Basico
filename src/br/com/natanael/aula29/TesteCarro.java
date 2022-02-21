package br.com.natanael.aula29;

import br.com.natanael.aula24.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		Carro hatch0 = new Carro();
		hatch0.marca = "Peugeot";
		hatch0.modelo = "208";
		hatch0.numPassageiros = 5;
		hatch0.autonomia = 12.7;
		hatch0.tanqueCombustivel = 45;
		hatch0.potencia = 95;
		
		System.out.println(hatch0.numPassageiros);
		
		Carro hatch1 = new Carro("Peugeot", "208");
		
		System.out.println(hatch1.marca);
		System.out.println(hatch1.modelo);
		System.out.println(hatch1.numPassageiros);
		System.out.println(hatch1.autonomia);
		System.out.println(hatch1.tanqueCombustivel);
		System.out.println(hatch1.potencia);
		
		
	}

}
