package exercicios_aula_2;

import java.util.Scanner;

public class ExSete {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float a, b;
		int resp;
		
		System.out.println("Valor Nº 1: ");
		a = leia.nextFloat();
		System.out.println("Valor Nº 2: ");
		b = leia.nextFloat();
		
		System.out.println("1-Soma\n2-Subtração\n"
				+ "3-Multiplicação\n4-Divisão\nResposta: ");
		resp = leia.nextInt();
		
		switch(resp) {
		case 1:
			System.out.printf("\n%.2f + %.2f = %.2f", a, b, a + b);
			break;
		case 2:
			System.out.printf("\n%.2f - %.2f = %.2f", a, b, a - b);
			break;
		case 3:
			System.out.printf("\n%.2f x %.2f = %.2f", a, b, a * b);
			break;
		case 4:
			if(a > 0 && b > 0) {
				System.out.printf("\n%.2f / %.2f = %.2f", a, b, a / b);
			}else {
				System.out.println("Número zero não é divisível");
			}
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}

}
