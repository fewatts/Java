package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int dinheiro, nota_100 = 0, nota_50 = 0, nota_20 = 0, nota_10 = 0, nota_5 = 0, nota_2 = 0, nota_1 = 0;
		
		System.out.println("Valor de saque: ");
		dinheiro = leia.nextInt();
		
		while(dinheiro > 0) {
			if(dinheiro >= 100) {
				dinheiro -= 100;
				nota_100 += 1;
			}
			else if(dinheiro >= 50) {
				dinheiro -= 50;
				nota_50 += 1;
			}
			else if(dinheiro >= 20) {
				dinheiro -= 20;
				nota_20 += 1;
			}
			else if(dinheiro >= 10) {
				dinheiro -= 10;
				nota_10 += 1;
			}
			else if(dinheiro >= 5) {
				dinheiro -= 5;
				nota_5 += 1;
			}
			else if(dinheiro >= 2) {
				dinheiro -= 2;
				nota_2 += 1;
			}
			else if(dinheiro >= 1) {
				dinheiro -= 1;
				nota_1 += 1;
			}
			else{
				break;
			}
		}
		if(nota_100 > 0)
			System.out.printf("\n%d nota/s de R$ 100,00\n", nota_100);
		if(nota_50 > 0)
			System.out.printf("\n%d nota/s de R$ 50,00\n", nota_50);
		if(nota_20 > 0)
			System.out.printf("\n%d nota/s de R$ 20,00\n", nota_20);
		if(nota_10 > 0)
			System.out.printf("\n%d nota/s de R$ 10,00\n", nota_10);
		if(nota_5 > 0)
			System.out.printf("\n%d nota/s de R$ 5,00\n", nota_5);
		if(nota_2 > 0)
			System.out.printf("\n%d nota/s de R$ 2,00\n", nota_2);
		if(nota_1 > 0)
			System.out.printf("\n%d nota/s de R$ 1,00\n", nota_1);

	}

}
