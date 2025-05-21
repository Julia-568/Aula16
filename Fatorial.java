package Aula16;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int fat = 1, num;
		
		System.out.println("Informe o fatorial: ");
		num = ler.nextInt();
		
		if (num < 0) {
			System.out.println("Não existe fatorial de número negativo!");
			System.exit(0);
		}
			for(int i = 1; i <= num; i++) {
				fat *= 1; 
			}
		System.out.println("O fatorial de " + num + " é: " + fat);
		ler.close();
		}
	}

