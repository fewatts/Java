package exercicios_aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int j = 1, num;
		
		for(int i = 0; i < 10; i++) {
			numeros.add(j);
			j++;
		}
		System.out.println("procurar um número: ");
		num = leia.nextInt();
		if(numeros.contains(num))
			System.out.printf("\nO número %d está localizado na posição %d", num, numeros.indexOf(num));
		else
			System.out.printf("\nO número %d não foi achado...\n", num);
	}

}
