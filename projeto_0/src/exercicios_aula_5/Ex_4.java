package exercicios_aula_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex_4 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		int num;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("procurar um número: ");
		num = leia.nextInt();
		if(numeros.contains(num))
			System.out.printf("\nO número %d foi encontrado!", num);
		else
			System.out.printf("\nO número %d não foi achado...\n", num);

	}

}
