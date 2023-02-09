package exercícios_aula_1;

import java.util.Scanner;

public class ExUm {

	public static void main(String[] args) {
		float salario, abono, novo_salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novo_salario = salario + abono;
		System.out.printf("O novo salário é de: %.2f", novo_salario);
		
		leia.close();

	}

}
