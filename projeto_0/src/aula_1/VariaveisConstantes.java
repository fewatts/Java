package aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VariaveisConstantes {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		String nome;
		double area;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um número float: ");
		area = leia.nextDouble();
		
		System.out.println("O meu nome é: " + nome);
		System.out.println("O número declarado foi: " + numero);
		System.out.printf("O número é: %.2f", area);
		
		
		System.out.println("\nA área é: " + df.format(area));
		
	}
}
