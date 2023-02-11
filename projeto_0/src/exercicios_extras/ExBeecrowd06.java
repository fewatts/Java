package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		
		for(int i = 1; i < 4; i++) {
			System.out.printf("%dº Número: ", i);
			if(i == 1)
				a = leia.nextInt();
			else if(i == 2)
				b = leia.nextInt();
			else
				c = leia.nextInt();
		}
		if(a + b > c && a + c > b && b + c > a) {
			System.out.printf("É possível formar triângulo! ");
			if(a == b && b == c) {
				System.out.println(", É EQUILÁTERO");
			}
			else if(a == b || b == c || a == c) {
				System.out.println(", É ISÓCELES");
			}
			else if(a != b && b != c) {
				System.out.println(", É ESCALENO");
			}
		}else {
			System.out.println("Não é possível formar triângulo...");
		}
		

	}

}
