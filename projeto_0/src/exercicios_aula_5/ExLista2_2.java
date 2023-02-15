package exercicios_aula_5;


import java.util.Scanner;
import java.util.Stack;

public final class ExLista2_2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int op;
		String livro;
		
		do {
			System.out.printf("\n1-Adicionar livro na pilha\n2-Listar todos os livros\n3-Retirar livro da pilha\n0-Sair");
			System.out.println("\nSua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Nome do livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("livro adicionado!\n");
				break;
			case 2:
				System.out.println("\nLista de livros na pilha: ");
				if(pilha.isEmpty())
					System.out.println("pilha ainda está vazia...");
				else
					pilha.forEach(System.out::println);
				System.out.println();
				break;
			case 3:
				if(pilha.isEmpty())
					System.out.println("pilha ainda está vazia...\n");
				else {
					System.out.println("Retirar um livro da pilha: ");
					System.out.println(pilha.peek());
					pilha.pop();
					System.out.println("\nlivro retirado!");
				}
					System.out.println("\npilha atualizada: ");
				if(pilha.isEmpty())
					System.out.println("A pilha acabou...");
				else
					pilha.forEach(System.out::println);
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
