package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd11 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float n1 = -1, n2 = -1;
		
		
		while(n1 < 0 || n1 > 10) {
			System.out.println("Digite a primeira nota: ");
			n1 = leia.nextFloat();
			if(n1 >= 0 && n1 <= 10)
				break;
			System.out.println("Nota inválida... 0 a 10!");
		}
		while(n2 < 0 || n2 > 10) {
			System.out.println("Digite a segunda nota: ");
			n2 = leia.nextFloat();
			if(n2 >= 0 && n2 <= 10)
				break;
			System.out.println("Nota inválida... 0 a 10!");
		
		}
		System.out.printf("\nA média do aluno é: %.2f\n", (n1 + n2) / 2);

    }
	
}
