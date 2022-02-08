package br.com.natanael.aula24;

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
		
		Carro hatch1 = new Carro();
		hatch1.marca = "Nissan";
		hatch1.modelo = "March";
		hatch1.numPassageiros = 5;
		hatch1.autonomia = 11.5;
		hatch1.tanqueCombustivel = 45;
		hatch1.potencia = 111;

		System.out.println(hatch1.marca);
		System.out.println(hatch1.modelo);
		
	}

}
