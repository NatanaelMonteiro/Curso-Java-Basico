package br.com.natanael.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		//contato.setNome("Natan");
		//contato.setEndereco("Rua 12 norte");
		//contato.setTelefone("61 3435-7193");
		
		//criar objeto nome (extra)
		
		Nome nome = new Nome();
		nome.setNome("Natan");
		nome.setSobrenome("Lima");
		
		contato.setNome(nome);
		
		//criar objeto endereco
		
		Endereco ende = new Endereco();
		ende.setNomeRua("Rua 12 norte");
		ende.setNumero("904");
		ende.setComplemento("Apartamento");
		ende.setCidade("Aguas Claras");
		ende.setEstado("Distrito Federal");
		ende.setCep("123456789");
		
		contato.setEndereco(ende);
		
		//criar objeto telefone
		
		Telefone telefone = new Telefone();
		telefone.setTipo("residencial");
		telefone.setDd("61");
		telefone.setNumero("3435-7193");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("celular");
		telefone2.setDd("61");
		telefone2.setNumero("1234-4321");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		//teste de saida no console
		
		//System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getNome() != null) {
			System.out.println(contato.getNome().getNome() + " " + contato.getNome().getSobrenome());
		}
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDd() + " " + t.getNumero());
				
			}
		}
	}

	
}
