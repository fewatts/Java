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
			System.out.println("4-Remover uma nota");
			System.out.println("5-Atualizar nota");
			System.out.println("6-Encerrar");
			System.out.println("Sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println();
				while(nota <= 0 || nota > 10) {
					System.out.println("Digite uma nota de 1 a 10: ");
					nota = leia.nextDouble();
				}
				notas.add(nota);
				break;
			case 2:
				System.out.println();
				System.out.println("Lista de notas: ");
				if(notas.isEmpty())
					System.out.println("Base de dados ainda está vazia...");
				else
					notas.forEach(System.out::println);
				break;
			case 3:
				System.out.println("\nprocurar nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				if(notas.contains(nota))
					System.out.printf("O índice da nota é: " + notas.indexOf(nota));
				else
					System.out.println("Esse número não foi achado...");
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("Remover nota: ");
				nota = leia.nextDouble();
				notas.remove(notas.indexOf(nota));
				break;
			case 5:
				System.out.println("Atualizar nota:");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Nova nota: ");
				double novanota = leia.nextDouble();
				notas.set(notas.indexOf(nota), novanota);
			default:
				if(op > 6 || op < 1)
					System.out.println("Opção inválida...");
				break;
			}
			
		}while(op != 6);
			
	}

}
