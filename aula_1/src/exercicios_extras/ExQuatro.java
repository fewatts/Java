package exercicios_extras;

import java.util.Scanner;

public class ExQuatro {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nome;
		float sal_fixo, tot_vendas, sal_liqu;
		
		System.out.println("Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Salário fixo[R$]: ");
		sal_fixo = leia.nextFloat();
		
		System.out.println("Total de vendas[R$]: ");
		tot_vendas = leia.nextFloat();
		
		sal_liqu = (float) (sal_fixo + (0.15 * tot_vendas));
		System.out.printf("O salário de %s final é de: %.2f R$", nome, sal_liqu);
		
	}

}
