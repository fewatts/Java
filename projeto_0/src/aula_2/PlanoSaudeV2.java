package aula_2;

import java.util.Scanner;

public class PlanoSaudeV2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int faixa;
		
		System.out.println("<<< Plano de saúde >>>");
		System.out.println("Faixa 1: até 10 anos");
		System.out.println("Faixa 2: Acima de 10 até 29 anos");
		System.out.println("Faixa 3: Acima de 29 até 45 anos");
		System.out.println("Faixa 4: Acima de 45 até 59 anos");
		System.out.println("Faixa 5: Acima de 59 até 65 anos");
		System.out.println("Faixa 6: Acima de 65 anos");
		System.out.println("Qual sua faixa etária? ");
		faixa = leia.nextInt();
		
		switch(faixa) {
		case 1:
			System.out.println("O preço é 100,00 R$");
			break;
		case 2:
			System.out.println("O preço é 200,00 R$");
			break;
		case 3:
			System.out.println("O preço é 300,00 R$");
			break;
		case 4:
			System.out.println("O preço é 500,00 R$");
			break;
		case 5:
			System.out.println("O preço é 600,00 R$");
			break;
		case 6:
			System.out.println("O preço é 1.000,00 R$");
			break;
		default:
			System.out.println("Faixa inválida!");
		}
	}
}
