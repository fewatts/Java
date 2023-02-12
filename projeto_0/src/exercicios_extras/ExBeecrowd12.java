package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd12 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
		}

	}

}
