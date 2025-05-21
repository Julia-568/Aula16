package Aula16;

import java.util.Scanner;

public class Senha {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int senhaMestre, senhaTentativa;
		double numero1, numero2, soma;
		
		System.out.println("Cadastre uma senha (apenas com números): ");
		senhaMestre = ler.nextInt();
		
		System.out.println("Digite um número: ");
		numero1 = ler.nextDouble();
		System.out.println("Digite um número: ");
		numero2 = ler.nextDouble();
		
		do {
			System.out.println("Digite a senha para desbloquear a soma: ");
			senhaTentativa = ler.nextInt();
			
		} while (senhaTentativa != senhaMestre);
		soma = numero1 + numero2;
		System.out.println("A soma dos números é: " + soma);
		
		ler.close();
	}
}
