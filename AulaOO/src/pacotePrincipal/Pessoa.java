package pacotePrincipal;

public class Pessoa {
	
	String nome;
	int idade;
	String CPF;
	DadosEndereco endereco;
	
	Pessoa() {
		endereco = new DadosEndereco();
		
	}
	
	Pessoa(String name, int age, String id){
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
	}
	
	Pessoa(String name, int age, String id, String street,
			 int number, String compl, String city, String UF,
			String code ){
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
		endereco.logradouro = street;
		endereco.numero = number;
		endereco.complemento = compl;
		endereco.cidade = city;
		endereco.estado = UF;
		endereco.CEP = code;
	}
	
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		if (imprimirEndereco == 'N' || imprimirEndereco == 'n')
		    return " Nome: " + nome + "\nIdade: " + Integer.toString(idade)+
				"\nCPF: "  + CPF;
		else
			return " Nome: " + nome + "\nIdade: " + Integer.toString(idade)+
					"\nCPF: "  + CPF + "\n" + 
			         endereco.imprimirDadosEndereco();
		
	}

}
