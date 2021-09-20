package pacotePrincipal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);
		char imprimirEndereco;
		
		System.out.println(" Digite o nome:");
		p1.nome = entCaracter.nextLine();
		
		System.out.println(" Digite a idade:");
		p1.idade = entNumerico.nextInt();
		
		System.out.println(" Digite o CPF:");
		p1.CPF = entCaracter.nextLine();
		
		System.out.println(" Digite a Rua:");
		p1.endereco.logradouro = entCaracter.nextLine();
		
		System.out.println(" Digite o número:");
		p1.endereco.numero = entNumerico.nextInt();
		
		System.out.println(" Digite o complemento :");
		p1.endereco.complemento = entCaracter.nextLine();
		
		System.out.println(" Digite  a Cidade :");
		p1.endereco.cidade = entCaracter.nextLine();
		
		System.out.println(" Digite o Estado :");
		p1.endereco.estado = entCaracter.nextLine();
		
		System.out.println(" Digite o CEP :");
		p1.endereco.CEP = entCaracter.nextLine();
		
		System.out.println(" Deseja imprimir os dados com o  endereço :");
		imprimirEndereco = entCaracter.nextLine().charAt(0);
		
		
		
		System.out.printf("%s\n Dados Preenchidos " , p1.imprimirDadosPessoa(imprimirEndereco));
		
		Pessoa p2 = new Pessoa("Lucas Carvalho" ,50,"000.000.000-00");
		p2.endereco.logradouro = "Avenida Almirante Arantes";
		p2.endereco.numero = 120;
		p2.endereco.complemento = "Apto B";
		p2.endereco.cidade = "Campinas";
		p2.endereco.estado = "SP";
		p2.endereco.CEP = "54147-400";
		
		System.out.printf("%s\n", p2.imprimirDadosPessoa('S'));
		
		
		
		
	}

}
