package exercicios_aula_5;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_3 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<Integer>();
		Integer n;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número [Não pode repetir]: ");
			n = leia.nextInt();
			num.add(n);
		}
		System.out.println("\nListar os dados do set: ");
		Iterator<Integer> inum = num.iterator();
		while(inum.hasNext()) {
			System.out.println(inum.next());
		}
		
	}

}
