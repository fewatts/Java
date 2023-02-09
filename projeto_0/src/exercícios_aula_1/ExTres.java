package exercícios_aula_1;

import java.util.Scanner;

public class ExTres {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float sal_bruto, adic_not, hora_extra, descont, sal_liqui;
		
		
		System.out.println("Salário bruto: ");
		sal_bruto = leia.nextFloat();
		
		System.out.println("Adicional noturno: ");
		adic_not = leia.nextFloat();
		
		System.out.println("Horas extras: ");
		hora_extra = leia.nextFloat();
		
		System.out.println("Descontos: ");
		descont = leia.nextFloat();
		
		sal_liqui = sal_bruto + adic_not + (hora_extra * 5) - descont;
		
		System.out.printf("Salário líquido: %.2f", sal_liqui);
		
		leia.close();
	}

}
