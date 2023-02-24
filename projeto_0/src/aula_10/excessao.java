package aula_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excessao {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int dividendo = 0, divisor = 0, resp = 0;
		boolean loop = true;
		while(true) {
			do {
				try {	
					System.out.println("Digite o Dividendo: ");
					dividendo = ler.nextInt();
					System.out.println("Digite o Divisor: ");
					divisor = ler.nextInt();
					divide(dividendo, divisor);
					loop = false;
				}catch(InputMismatchException e) {
					System.err.println("Exceção : " + e);
					ler.nextLine();
					System.out.println("Digite somente números...");
				}catch(ArithmeticException e) {
					System.err.println("Exceção : " + e);
					ler.nextLine();
					System.out.println("Não existe divisão por zero...");
				}
				
			}while(loop);
			do {
				try {
					System.out.println("Deseja continuar? [1- sim | 2- não]");
					resp = ler.nextInt();
				}catch(InputMismatchException e) {
					System.err.println("Exceção : " + e);
					ler.nextLine();
					System.out.println("Digite somente números...");
				}
			}while(resp != 1 && resp != 2);
			if(resp == 2)
				System.exit(0);
		}
		
	}

	public static void divide(int dividendo, int divisor) throws MinhaExcecao {
		System.out.println("Divisão = " + (dividendo / divisor));
		
	}

}
