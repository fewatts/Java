package exercicios_extras;

import java.util.Scanner;

public class ExBecrowd05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0;
		
		for(int i = 1; i < 4; i++) {
			System.out.printf("%dº Número: ", i);
			if(i == 1)
				n1 = leia.nextInt();
			else if(i == 2)
				n2 = leia.nextInt();
			else
				n3 = leia.nextInt();
		}
		
		if(n3 < n2 && n3 < n1 && n1 < n2) {
			System.out.printf("\n%d\n%d\n%d\n", n3, n1, n2);
			System.out.printf("\n%d\n%d\n%d", n1, n2, n3);
		}
		else if(n1 < n3 && n1 < n2 && n2 > n3) {
			System.out.printf("\n%d\n%d\n%d\n", n1, n3, n2);
			System.out.printf("\n%d\n%d\n%d", n1, n2, n3);
		}
		else if(n1 > n2 && n2 > n3){
			System.out.printf("\n%d\n%d\n%d\n", n3, n2, n1);
			System.out.printf("\n%d\n%d\n%d", n1, n2, n3);
		}
		else if(n3 > n1 && n1 > n2) {
			System.out.printf("\n%d\n%d\n%d\n", n2, n1, n3);
			System.out.printf("\n%d\n%d\n%d", n1, n2, n3);
		}
		else if(n1 > n3 && n3 > n2) {
			System.out.printf("\n%d\n%d\n%d\n", n2, n3, n1);
			System.out.printf("\n%d\n%d\n%d", n1, n2, n3);
		}
		
	}

}
