package exercicios_aula_4;

import java.util.Scanner;

public class Ex_02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float soma = 0;
		
		int Vetor[] = new int[10]; 
		
		for(int i = 0; i < Vetor.length; i++) {
			System.out.printf("Digite o valor [%d]: ", i);
			Vetor[i] = leia.nextInt();
		}
		System.out.println("\n");
		System.out.println("Elementos nos índices Ímpares: ");
		for(int i = 0; i < Vetor.length; i++) {
			soma += Vetor[i];
			if(i % 2 != 0) {
				System.out.printf(" %d ", Vetor[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Elementos pares: ");
		for(int i = 0; i < Vetor.length; i++) {
			if(Vetor[i] % 2 == 0) {
				System.out.printf(" %d ", Vetor[i]);
			}
		}
		System.out.println("\n");
		System.out.printf("\nSoma: %.2f", soma);
		System.out.println("\n");
		System.out.printf("\nA média é de: %.2f", soma / Vetor.length);
	}

}
