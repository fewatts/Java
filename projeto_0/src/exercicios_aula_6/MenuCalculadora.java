package exercicios_aula_6;

import java.util.Scanner;

public class MenuCalculadora {
	
	static Scanner leia = new Scanner(System.in);
	static Calculos calc = new Calculos();

	public static void main(String[] args) {
		double a, b;
		int op;
		
		while(true) {
			System.out.println("\n1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");
			System.out.println("0-Sair do programa");
			System.out.println(">>>Sua opção: ");
			op = leia.nextInt();
			if(op == 0)
				System.exit(0);
			System.out.println("Digite o 1º valor: ");
			a = leia.nextDouble();
			System.out.println("Digite o 2º valor: ");
			b = leia.nextDouble();
			//Se for mais de um comando usar chaves
			switch(op) {
			case 1 -> System.out.println("\nSoma: " + calc.soma(a, b));
			case 2 -> System.out.println("\nSubtração: "+ calc.subtracao(a, b));
			case 3 -> System.out.println("\nMultiplicação: "+ calc.multiplicacao(a, b));
			case 4 -> System.out.println("\nDivisão: " + calc.divisao(a, b));
			default -> System.out.println("\nOpção inválida...");
			}
			
		}
		
	}
	
}
