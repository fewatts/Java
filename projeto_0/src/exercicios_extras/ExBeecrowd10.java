package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd10 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.printf("%d ^ 2 = %d\n", i, (i * i));
			}
		}

	}

}
