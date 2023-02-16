package exercicios_extras;

import java.util.Scanner;

public class ExUm {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int soma__ = 0, quant;
		
		System.out.println("<<<< soma__dor de números >>>>");
		System.out.println("¬Deseja soma__r quantos números? ");
		
		quant = leia.nextInt();
		
		for(int i = 1; i <= quant; i++) {
			System.out.printf("Digite o Nº %d: ", i);
			soma__ += leia.nextInt();
		}
		System.out.println("A soma__ dos valores é igual a "+ soma__);
	}

}
