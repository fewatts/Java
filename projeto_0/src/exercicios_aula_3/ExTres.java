package exercicios_aula_3;

import java.util.Scanner;

public class ExTres {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1, soma_menor = 0, soma_maior = 0;
		
		while(n >= 0) {
			System.out.println("Digite uma idade: ");
			n = leia.nextInt();
			
			if(n < 0) {
				System.out.println(">>>> Fim <<<<\n");
			}else {
				if(n < 21 && n != 0) {
					soma_menor += 1;
				}else if(n > 50) {
					soma_maior += 1;
				}
			}
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + soma_menor);
		System.out.println("Total de pessoas com mais de 50 anos: " + soma_maior);
	}

}
