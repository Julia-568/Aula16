package Aula16;

import java.util.Scanner;

public class JuntaVetores {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int vetor1 [] = new int[2];
		int vetor2 [] = new int[2];
		int vetoresJuntos [] = new int[4];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor: ");
			vetor1[i] = ler.nextInt();
	}
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor: ");
			vetor2[i] = ler.nextInt();
	}
		for (int i = 0; i < 2; i++) {
			vetoresJuntos[i] = vetor1[i];
			vetoresJuntos[i+2] = vetor2[i];	
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Informe o valor " + i + "o valor: " + vetoresJuntos[i]);
		}
		
		ler.close();

    }
}