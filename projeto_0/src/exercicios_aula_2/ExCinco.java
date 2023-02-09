package exercicios_aula_2;

import java.util.Scanner;

public class ExCinco {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int prod, quant;
		float tot = 0;
		String pro = "";
		
		System.out.println("1-Cachorro quente: R$ 10,00");
		System.out.println("2-X-Salada: R$ 15,00");
		System.out.println("3-X-Bacon: R$ 18,00");
		System.out.println("4-Bauru: R$ 12,00");
		System.out.println("5-Refrigerante: R$ 8,00");
		System.out.println("6-Suco de laranja: R$ 13,00");
		
		System.out.println("\nCódigo do produto: ");
		prod = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quant = leia.nextInt();
		
		switch(prod) {
		case 1:
			pro = "Cachorro quente";
			tot = 10 * quant;
			break;
		case 2:
			pro = "X-Salada";
			tot = 15 * quant;
			break;
		case 3:
			pro = "X-Bacon";
			tot = 18 * quant;
			break;
		case 4:
			pro = "Bauru";
			tot = 12 * quant;
			break;
		case 5:
			pro = "Refrigerante";
			tot = 8 * quant;
			break;
		case 6:
			pro = "Suco de laranja";
			tot = 13 * quant;
			break;
		default:
			System.out.println("Produto inválido!");
		}
		System.out.printf("Produto: %s\n", pro);
		System.out.printf("Valor total: R$ %.2f", tot);
	}

}
