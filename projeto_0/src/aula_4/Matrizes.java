package aula_4;

import java.util.Scanner;

public class Matrizes {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int MatrizInt[][] = new int[2][3];
		
		//Se tiver mais linhas que colunas, usar o
		//l < MatrizInt[c].length
		// c < MatrizInt.length
		
		for(int l = 0; l < MatrizInt.length; l++) {
			for(int c = 0; c < MatrizInt[l].length; c++) {
				System.out.printf("Digite o valor [%d][%d]: \n", l, c);
				MatrizInt[l][c] = leia.nextInt();
			}
		}
		
		for(int l = 0; l < MatrizInt.length; l++) {
			for(int c = 0; c < MatrizInt[l].length; c++) {
				System.out.printf(" %d ", MatrizInt[l][c]);
			}
			System.out.println();
		}
		
	}
	
}
