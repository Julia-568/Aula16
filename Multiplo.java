package Aula16;

import java.util.Scanner;

public class Multiplo {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double numero;
		
		System.out.println("Informe um valor: ");
		numero = ler.nextDouble();
		
		String mensagem = numero % 5 == 0 ? "É multiplo de 5" : "Não é multiplo de 5"; 
			System.out.println(mensagem);
		
		ler.close();
	}

}
