package aula_5;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Elisangela");
		System.out.println();
		
		for(var elem : pilha) {
			System.out.println(elem);
		}
		
		System.out.println("\nRemovendo item da pilha: ");
		pilha.pop();
		for(var elem : pilha) {
			System.out.println(elem);
		}
		System.out.println("Topo: " + pilha.peek());
	}

}
