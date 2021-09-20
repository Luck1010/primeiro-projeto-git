package Pacote01;

import java.util.Scanner;

public class Classe01 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
        boolean continuar = true;
		String senha = "123ln", senhaDigitada;
		int nTentativas = 0;
		
		while (continuar) {
			System.out.println("Digite a senha de acesso: ");
			senhaDigitada = ent.nextLine();
			nTentativas++;
			
			if (senha.equals(senhaDigitada)) {
				System.out.println("Acesso concedido. ");
				break;
			} else if (nTentativas > 2) {
				System.out.println("Número de tentativas execedido.");
				break;
			}
			
		}
			
		
	}

}
