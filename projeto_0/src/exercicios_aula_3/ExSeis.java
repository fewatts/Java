package exercicios_aula_3;

import java.util.Scanner;

public class ExSeis {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n, soma_mult = 0, count = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
			if(n % 3 == 0) {
				soma_mult += n;
				count += 1;
			}
		}while(n != 0 && n > 0);
		System.out.println("A média de todos os números múltiplos de 3 é: "+ soma_mult / count);

	}

}
