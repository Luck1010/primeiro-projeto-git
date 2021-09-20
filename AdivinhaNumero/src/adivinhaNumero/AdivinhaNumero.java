package adivinhaNumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
	public static void dica(int palpite, int numero, int tentativas) {
		if (palpite > numero) {
			System.out.println(" Seu palpite � maior que o n�mero");
		} else {
			if (palpite < numero) {
				System.out.println("Seu palpite � menor que o n�mero ");			
			} else {
				System.out.println(" Voc� acertou ! O numero era: " + numero);
				System.out.println(" Voc� tentou " + tentativas + " vezes ");
			}
		}
		
		
	}
	
	public static void main(String[] args ) {
		int palpite = 0, sorteado, tentativas = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		Random geradorDeAleatorio = new Random();
		sorteado = geradorDeAleatorio.nextInt(99) + 1;
		
		do {
			System.out.printf("\n\n--------------------\n");
			System.out.println("N�mero de tentativas: " + tentativas);
			
			System.out.print("Qual seu palpite: ");
			palpite = entrada.nextInt();
			tentativas++;
			
			dica(palpite, sorteado, tentativas);
		}while (palpite != sorteado);
		
	} 
	

}



