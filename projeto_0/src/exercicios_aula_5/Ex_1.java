package exercicios_aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			leia.skip("\\R?");
			cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("\nTodas as cores: ");
		for(var c : cores) {
			System.out.printf(" %s \n", c);
		}
		cores.sort(null);
		System.out.println("\nOrdenando as cores: ");
		for(var c : cores) {
			System.out.printf(" %s \n", c);
		}

	}

}
