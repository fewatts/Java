package exercicios_aula_2;

import java.util.Scanner;

public class ExUm {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, c;
		
		System.out.println("Valor de a: ");
		a = leia.nextInt();
		System.out.println("Valor de b: ");
		b = leia.nextInt();
		System.out.println("Valor de c: ");
		c = leia.nextInt();
		
		if(a + b > c) {
			System.out.printf("%d + %d = %d > %d", a, b, a + b, c);
			System.out.println("\nA soma de a + b é maior que c.");
		}
		else if(a + b < c) {
			System.out.printf("%d + %d = %d < %d", a, b, a + b, c);
			System.out.println("\nA soma de a + b é menor que c.");
		}
		else if(a + b == c) {
			System.out.printf("%d + %d = %d = %d", a, b, a + b, c);
			System.out.println("\nA soma de a + b é igual a c.");
		}
	}
}
