package exercicios_extras;

import java.util.Scanner;

public class ExCinco {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nome;
		float soma_notas = 0;
		
		System.out.println("Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		for(int i = 1; i < 4; i++) {
			System.out.printf("%dº Nota: ", i);
			soma_notas += leia.nextFloat();
		}
		System.out.printf("A média de %s é de %.1f", nome, soma_notas / 3);
	}

}
