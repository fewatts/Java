package exercicios_aula_2;

import java.util.Scanner;

public class ExDois {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			System.out.printf("O número %d é par ", n);
			if(n > 0) {
				System.out.printf("e positivo!");
			}else{
				System.out.printf("e negativo!");
			}
		}else{
			System.out.printf("O número %d é ímpar ", n);
			if(n > 0) {
				System.out.printf("e positivo!");
			}else{
				System.out.printf("e negativo!");
			}
		}
	}
}
