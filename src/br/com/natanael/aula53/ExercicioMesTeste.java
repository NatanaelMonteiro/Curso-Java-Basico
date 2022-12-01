package br.com.natanael.aula53;

public class ExercicioMesTeste {

	public static void main(String[] args) {
		
		usandoEnumMes();
		
	}
	
	private static void usandoEnumMes() {
		EnumMes janeiro = EnumMes.JANEIRO;
		EnumMes fevereiro = EnumMes.FEVEREIRO;
		EnumMes março = EnumMes.MARCO;
		EnumMes abril = EnumMes.ABRIL;
		EnumMes maio = EnumMes.MAIO;
		EnumMes junho = EnumMes.JUNHO;
		EnumMes julho = EnumMes.JULHO;
		EnumMes agosto = EnumMes.AGOSTO;
		EnumMes setembro = EnumMes.SETEMBRO;
		EnumMes outubro = EnumMes.OUTUBRO;
		EnumMes novembro = EnumMes.NOVEMBRO;
		EnumMes dezembro = EnumMes.DEZEMBRO;
		
		System.out.println("Teste mês Enum");
		System.out.println();
		imprimeEnumMes(janeiro);
		imprimeEnumMes(fevereiro);
		imprimeEnumMes(março);
		imprimeEnumMes(abril);
		imprimeEnumMes(maio);
		imprimeEnumMes(junho);
		imprimeEnumMes(julho);
		imprimeEnumMes(agosto);
		imprimeEnumMes(setembro);
		imprimeEnumMes(outubro);
		imprimeEnumMes(novembro);
		imprimeEnumMes(dezembro);
	}

	private static void imprimeEnumMes(EnumMes mes) {
		switch (mes) {
		case JANEIRO:
			System.out.println("Janeiro");
			break;
		case FEVEREIRO:
			System.out.println("Fevereiro");
			break;
		case MARCO:
			System.out.println("Março");
			break;
		case ABRIL:
			System.out.println("Abril");
			break;
		case MAIO:
			System.out.println("Maio");
			break;
		case JUNHO:
			System.out.println("Junho");
			break;
		case JULHO:
			System.out.println("Julho");
			break;
		case AGOSTO:
			System.out.println("Agosto");
			break;
		case SETEMBRO:
			System.out.println("Setembro");
			break;
		case OUTUBRO:
			System.out.println("Outubro");
			break;
		case NOVEMBRO:
			System.out.println("Novembro");
			break;
		case DEZEMBRO:
			System.out.println("Dezembro");
			break;
		}
	}
	
}
