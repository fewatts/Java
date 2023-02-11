package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		
		System.out.println("Primeiro número: ");
		a = leia.nextInt();
		System.out.println("Segundo número: ");
		b = leia.nextInt();
		
		System.out.printf("A soma entre %d e %d é igual a %d", a, b, a + b);

	}

}
