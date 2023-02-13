package exercicios_aula_4;

import java.util.Scanner;

public class Ex_04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float matriz[][] = new float[10][4];
		float media[] = new float[3];
		float soma = 0.0f;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.println("Digite a nota: ");
				matriz[l][c] = leia.nextFloat();
			}
		}
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				soma += matriz[l][c];
			}
			media[l] = soma / matriz[l].length;
			soma = 0.0f;
		}
		for(var medias : media)
			System.out.printf(" %.1f ", medias);
		
	}

}
