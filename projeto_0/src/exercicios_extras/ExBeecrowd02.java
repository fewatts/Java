package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double a = 0, r;
		final double n = 3.14159;
		
		System.out.println("Raio: ");
		r = leia.nextDouble();
		
		a = n * (r * r);
		System.out.printf("A área é igual a: %.4f", a);

	}

}
