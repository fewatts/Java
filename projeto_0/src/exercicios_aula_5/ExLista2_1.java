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
			System.out.printf("1-Adicionar Cliente na fila\n2-Listar todos os clientes\n3-Retirar cliente da fila\n0-Sair");
			System.out.println("\nSua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Nome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("Cliente adicionado!\n");
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
					System.out.println("Fila ainda está vazia...\n");
				else {
					System.out.println("Retirar um cliente da fila: ");
					System.out.println(fila.poll());
					System.out.println("\nCliente chamado!\n");
					System.out.println("\nFila atualizada: ");
					if(fila.isEmpty())
						System.out.println("A fila acabou...");
					fila.forEach(System.out::println);
					System.out.println();
				}
				for(var elem : fila){
					System.out.println(elem);
				}
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
