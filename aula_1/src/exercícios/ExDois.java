package exercícios;

import java.util.Scanner;

public class ExDois {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float soma = 0, media, nota;
	
		for(int i = 1; i < 5; i++) {
			System.out.print("Digite a nota "+ i);
			System.out.println(":\n");
			nota = leia.nextFloat();
			soma += nota;
		}
		media = soma / 4;
		System.out.printf("A média final é de: %.1f", media);

	}

}
