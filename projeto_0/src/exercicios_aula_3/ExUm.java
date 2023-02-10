package exercicios_aula_3;

import java.util.Scanner;

public class ExUm {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n1, n2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for(int i = n1; i <= n2; i++) {
				if(i % 3 == 0 && i % 5 == 0)
					System.out.printf("%d é múltiplo de 3 e 5!\n", i);
			}
		}else {
			System.out.println("Intervalo inválido!...");
		}

	}

}
