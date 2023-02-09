package exercicios_aula_2;

import java.util.Scanner;

public class ExOito {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float saldo = 1000, saque, deposito;
		int resp;
		
		System.out.println("<<<< Banco >>>>");
		System.out.println("1-Saldo\n2-Saque\n3-Depósito\n<<<Opção: ");
		
		resp = leia.nextInt();
		
		switch(resp) {
		case 1:
			System.out.printf("Operação: Saldo\nSaldo: %.2f", saldo);
			break;
		case 2:
			System.out.println("Valor do saque: ");
			saque = leia.nextFloat();
			
			if(saldo - saque > 0) {
				System.out.printf("Operação: Saque\nSaldo: %.2f", saldo - saque);
			}else {
				System.out.println("Saldo insuficiente...");
			}
			break;
		case 3:
			System.out.println("Valor de depósito: ");
			deposito = leia.nextFloat();
			System.out.printf("Operação: depósito\nSaldo: %.2f", saldo + deposito);
			break;
		default:
			System.out.println("Opção inválida!");
		}

	}

}
