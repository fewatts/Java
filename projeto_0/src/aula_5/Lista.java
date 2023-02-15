package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		int op = 0;
		double nota = 0.0;
		do {
			System.out.println();
			System.out.println("1-Cadastrar nota");
			System.out.println("2-Listar todas as notas");
			System.out.println("3-Buscar uma nota");
			System.out.println("6-Encerrar");
			System.out.println("Sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println();
				System.out.println("Digite uma nota de 1 a 10: ");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println();
				for(var listanota : notas) {
					System.out.printf("nota: %.2f\n", listanota);
				}
				break;
			case 3:
				System.out.println();
				System.out.println("procurar nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				System.out.printf("O índice da nota é: " + notas.indexOf(nota));
				break;
			}
		}while(op != 6);
			
	}

}
