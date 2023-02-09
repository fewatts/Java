package exercicios_extras;

import java.util.Scanner;

public class ExUm {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int soma = 0, quant;
		
		System.out.println("<<<< Somador de números >>>>");
		System.out.println("¬Deseja somar quantos números? ");
		
		quant = leia.nextInt();
		
		for(int i = 1; i <= quant; i++) {
			System.out.printf("Digite o Nº %d: ", i);
			soma += leia.nextInt();
		}
		System.out.println("A soma dos valores é igual a "+ soma);
	}

}
