package exercicios_aula_3;

import java.util.Scanner;

public class ExCinco {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n, soma_posi = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
			if(n > 0)
				soma_posi += n;
			
		}while(n != 0);
		
		System.out.println("A soma dos números positivos é de: "+ soma_posi);

	}

}
