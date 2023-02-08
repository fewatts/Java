package exercicios_extras;

import java.util.Scanner;

public class ExDois {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n1, n2, som = 0, sub = 0, mult = 0;
		float div = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		som = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		
		System.out.println("A soma vale: "+ som);
		System.out.println("A subtração vale: "+ sub);
		System.out.println("A multiplicação vale: "+ mult);
		System.out.printf("A divisão vale: %.2f", div);
		
	}

}
