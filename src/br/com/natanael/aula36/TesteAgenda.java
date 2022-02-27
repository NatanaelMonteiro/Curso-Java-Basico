package br.com.natanael.aula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		ContatosAgenda[] contatos = new ContatosAgenda[3];
		for (int i=0; i<3; i++) {
			System.out.println("Digite as informções: " + (i+1));
			ContatosAgenda c = new ContatosAgenda();
			
			System.out.println("Insira o nome: ");
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Insira o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Insira o email: ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
	}

}
