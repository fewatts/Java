package exercicios_aula_4;

import java.util.Scanner;

public class Ex_03 {
	
	static Scanner leia =  new Scanner(System.in);

	public static void main(String[] args) {
		int Matriz[][] = new int[3][3];
		int soma_1 = 0, soma_2 = 0;
		
		for(int l = 0; l < Matriz.length; l++) {
			for(int c = 0; c < Matriz.length; c++) {
				System.out.printf("Digite o valor [%d][%d]: \n", l, c);
				Matriz[l][c] = leia.nextInt();
			}
			
		}
		System.out.println("");
		System.out.println(" Matriz ");
		for(int l = 0; l < Matriz.length; l++) {
			for(int c = 0; c < Matriz.length; c++) {
				System.out.printf(" %d ", Matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("Elementos da diagonal principal:");
		for(int l = 0; l < Matriz.length; l++) {
			for(int c = 0; c < Matriz.length; c++) {
				if(l == c) {
					System.out.printf(" %d ", Matriz[l][c]);
					soma_1 += Matriz[l][c];
				}
				
			}
			
		}
		System.out.println("");
		System.out.println("Elementos da diagonal secundária: ");
		for(int l = 0; l < Matriz.length; l++) {
			for(int c = 0; c < Matriz.length; c++) {
				if(l == 0 && c == 2 || l == 1 && c == 1 || l == 2 && c == 0) {
					System.out.printf(" %d ", Matriz[l][c]);
					soma_2 += Matriz[l][c];
				}
			}
			
		}
		System.out.println("\nSoma dos elementos da diagonal principal: "+ soma_1);
		System.out.println("\nSoma dos elementos da diagonal secundária: "+ soma_2);
	}

}
