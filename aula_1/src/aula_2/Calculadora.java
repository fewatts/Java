package aula_2;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double n1, n2;
		
		System.out.println("Digite o 1ºN: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o 2ºN: ");
		n2 = leia.nextDouble();
		
		System.out.println("O número " + n1 + " elevado ao número "
		+ n2 + " é igual a " + Math.pow(n1, n2));
		System.out.println("O número " + n1 + " tem raiz quadrada de "
				+ Math.sqrt(n1));
		System.out.println("O número " + n2 + " tem raiz quadrada de "
				+ Math.sqrt(n2));
		
		System.out.println("Pré incremento");
		System.out.println(n1);
		System.out.println(++n1);
		
		System.out.println("Pós incremento");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);
		
		System.out.println(n1 += n2);
		
		if(n1 > 0 || n2 > 0)
			System.out.printf("O %.2f dividido por %.2f é igual a: %.2f", n1, n2, (n1 / n2));
		else
			System.out.println("Números negativos não podem ser divididos...");
	}

}
