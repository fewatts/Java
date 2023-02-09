package exercicios_aula_2;

import java.util.Scanner;

public class ExSeis {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int cargo;
		double sal, novo_sal = 0;
		String nome, carg = "";
		
		System.out.println("1-Gerente: 10%");
		System.out.println("2-Vendedor: 7%");
		System.out.println("3-Supervisor: 9%");
		System.out.println("4-Motorista: 6%");
		System.out.println("5-Estoquista: 5%");
		System.out.println("6-Técnico de TI: 8%");
		
		System.out.println("Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nCódigo do cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Salário: ");
		sal = leia.nextDouble();
		
		switch(cargo) {
		case 1:
			carg = "Gerente";
			novo_sal = sal + (0.10 * sal);
			break;
		case 2:
			carg = "Vendedor";
			novo_sal = sal + (0.07 * sal);
			break;
		case 3:
			carg = "Supervisor";
			novo_sal = sal + (0.09 * sal);
			break;
		case 4:
			carg = "Motorista";
			novo_sal = sal + (0.06 * sal);
			break;
		case 5:
			carg = "Estoquista";
			novo_sal = sal + (0.05 * sal);
			break;
		case 6:
			carg = "Técnico de TI";
			novo_sal = sal + (0.08 * sal);
			break;
		default:
			System.out.println("Produto inválido!");
		}
		System.out.printf("Nome do colaborador: %s\n", nome);
		System.out.printf("Cargo: %s\n", carg);
		System.out.printf("Salário ajustado: R$ %.2f", novo_sal);
	}

}
