package aula_2;

import java.util.Scanner;

public class PlanoSaude {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade;
		
		System.out.println("<<< Plano de saúde >>>");
		System.out.println("Qual sua idade? ");
		idade = leia.nextInt();
		
		if(idade > 0 && idade <= 120)
			if(idade <= 10)
				System.out.printf("Com %d anos o valor do plano é 100,00 R$", idade);
			else if(idade > 10 && idade <= 29)
				System.out.printf("Com %d anos o valor do plano é 200,00 R$", idade);
			else if(idade > 29 && idade <= 45)
				System.out.printf("Com %d anos o valor do plano é 300,00 R$", idade);
			else if(idade > 45 && idade <= 59)
				System.out.printf("Com %d anos o valor do plano é 500,00 R$", idade);
			else if(idade > 59 && idade <= 65)
				System.out.printf("Com %d anos o valor do plano é 600,00 R$", idade);
			else
				System.out.printf("Com %d anos o valor do plano é 1.000,00 R$", idade);
		else
			System.out.println("Idade inválida");
	}
	

}
