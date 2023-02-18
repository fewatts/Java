package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd09 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int f, y, soma = 0;
		System.out.println("Primeiro número: ");
		f = leia.nextInt();
		System.out.println("Segundo número: ");
		y = leia.nextInt();
		
		if(f < y) {
			for(int i = f; i <= y; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
			soma *= -1;
		}else {
			for(int i = y; i <= f; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.printf("A soma dos números ímpares do intervalo é: %d", soma);

	}

}
