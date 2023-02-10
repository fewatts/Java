package exercicios_aula_3;

import java.util.Scanner;

public class ExDois {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n, par_soma = 0, impar_soma = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.printf("Digite o %dº número: ", i);
			n = leia.nextInt();
			if(n % 2 == 0) {
				par_soma += 1;
			}else {
				impar_soma += 1;
			}
		}
		
		System.out.printf("Total de números pares: %d\nTotal de números ímpares: %d", par_soma, impar_soma);

	}

}
