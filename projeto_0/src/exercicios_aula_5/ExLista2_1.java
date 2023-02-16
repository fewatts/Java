package exercicios_aula_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExLista2_1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int op;
		String cliente;
		
		do {
			System.out.printf("\n1-Adicionar Cliente na fila\n2-Listar todos os clientes\n3-Retirar cliente da fila\n0-Sair");
			System.out.println("\nSua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Nome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nCliente adicionado!\n");
				break;
			case 2:
				System.out.println("\nLista de clientes na fila: ");
				if(fila.isEmpty())
					System.out.println("Fila ainda está vazia...");
				else
					fila.forEach(System.out::println);
				System.out.println();
				break;
			case 3:
				if(fila.isEmpty())
					System.out.println("fila ainda está vazia...\n");
				else {
					System.out.println("Retirar um cliente da fila: ");
					System.out.println(fila.peek());
					fila.poll();
					System.out.println("\ncliente chamado!!");
				}
					System.out.println("\nfila atualizada: ");
				if(fila.isEmpty())
					System.out.println("A fila acabou...");
				else
					fila.forEach(System.out::println);
				break;
			case 0:
				System.out.println("programa finalizado! Volte sempre!");
				break;
			default:
				System.out.println("Opção inválida...");
				break;
			}
		}while(op != 0);

	}

}
