package exercicios_extras;

import java.util.Scanner;

public class ExBeecrwod13 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int vetor[] = new int[9];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Inserir no vetor: ");
			vetor[i] = leia.nextInt();
		}
		System.out.println("Em ordem invertida: ");
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.printf(" posição:%d Nº:%d \n",i , vetor[i]);
		}
	}

}
