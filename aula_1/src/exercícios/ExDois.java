package exercícios;

import java.util.Scanner;

public class ExDois {

	public static void main(String[] args) {
		float soma = 0, media, nota;
		Scanner leia = new Scanner(System.in);
	
		for(int i = 1; i < 5; i++) {
			System.out.print("Digite a nota "+ i);
			System.out.println(":\n");
			nota = leia.nextFloat();
			soma = nota + soma;
		}
		media = soma / 4;
		System.out.printf("A média final é de: %.1f", media);

	}

}
