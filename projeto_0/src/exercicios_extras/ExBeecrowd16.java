package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd16 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				matriz[l][c] = 1;
			}
		}
		System.out.println();
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(n == 1)
					System.out.printf("  %d  ", matriz[l][c]);
				else if(n == 2)
					System.out.printf("  %d  ", matriz[l][c]);
				else if(n == 3) {
					if(l == 1 && c == 1) 
						System.out.printf("  %d  ", matriz[l][c] + 1);
					else
						System.out.printf("  %d  ", matriz[l][c]);
				}
				else if(n == 4) {
					if(l == 1 && c == 1 || l == 1 && c == 2 || l == 2 && c == 1 || l == 2 && c == 2) 
						System.out.printf("  %d  ", matriz[l][c] + 1);
					else
						System.out.printf("  %d  ", matriz[l][c]);
				}
				else if(n == 5) {
					if(l == 1 && c == 1 || l == 1 && c == 2 || l == 1 && c == 3 || l == 2 && c == 1 || l == 2 && c == 3 || l == 3 && c == 1 || l == 3 && c == 2 || l == 3 && c == 3) 
						System.out.printf("  %d  ", matriz[l][c] + 1);
					else if(l == 2 && c == 2)
						System.out.printf("  %d  ", matriz[l][c] + 2);
					else
						System.out.printf("  %d  ", matriz[l][c]);
				}
			
			}
			System.out.println("\n");
		}

	}
	
}
