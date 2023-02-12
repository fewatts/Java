package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd08 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int ddd;
		
		System.out.println("Digite um DDD para revelar o estado: ");
		ddd = leia.nextInt();
		
		if(ddd == 61) {
			System.out.println("É Brasília!");
		}
		else if(ddd == 71) {
			System.out.println("É Salvador!");
		}
		else if(ddd == 11) {
			System.out.println("É São paulo!");
		}
		else if(ddd == 21) {
			System.out.println("É Rio de janeiro!");
		}
		else if(ddd == 32) {
			System.out.println("É Juiz de fora!");
		}
		else if(ddd == 19) {
			System.out.println("É Campinas!");
		}
		else if(ddd == 27) {
			System.out.println("É Vitória!");
		}
		else if(ddd == 31) {
			System.out.println("É Belo horizonte!");
		}

	}

}
