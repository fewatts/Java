package exercícios;

import java.util.Scanner;

public class ExQuatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4, result;
		
		System.out.println("Nº 1: ");
		n1 = leia.nextInt();
		
		System.out.println("Nº 2");
		n2 = leia.nextInt();
		
		System.out.println("Nº 3");
		n3 = leia.nextInt();
		
		System.out.println("Nº 4");
		n4 = leia.nextInt();
		
		result = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: "+ result);
	}
}
