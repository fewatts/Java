package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd07 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float salario;
		
		System.out.println("Qual o seu salário? R$ ");
		salario = leia.nextFloat();
		
		if(salario > 0 && salario <= 400) {
			System.out.printf("O novo salário é de %.2f R$", salario + (salario * 0.15));
		}
		else if(salario > 400 && salario <= 800) {
			System.out.printf("O novo salário é de %.2f R$", salario + (salario * 0.12));
		}
		else if(salario > 800 && salario <= 1200) {
			System.out.printf("O novo salário é de %.2f R$", salario + (salario * 0.10));
		}
		else if(salario > 1200 && salario <= 2000) {
			System.out.printf("O novo salário é de %.2f R$", salario + (salario * 0.07));
		}
		else {
			System.out.printf("O novo salário é de %.2f R$", salario + (salario * 0.04));
		}

	}

}
