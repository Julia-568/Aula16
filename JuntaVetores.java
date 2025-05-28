package Aula16;

import java.util.Scanner;

public class JuntaVetores {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int vetor1 [] = new int[2];
		int vetor2 [] = new int[2];
		int resultado [] = new int[4];
		
		System.out.println("Leitura do primeiro array:");
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor: ");
			vetor1[i] = scanner.nextInt();
			resultado[i] = vetor1[i];
	}
		System.out.println("Leitura do segundo array:");
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor: ");
			vetor2[i] = scanner.nextInt();
			resultado[i+2] = vetor2[i];
	}
		System.out.println("Array resultante:");
		for (int i = 0; i < 4; i++) {
			System.out.println("Informe o valor " + i + "o valor: " + resultado[i]);
		}
		
		scanner.close();

    }
}
