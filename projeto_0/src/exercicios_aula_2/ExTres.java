package exercicios_aula_2;

import java.util.Scanner;

public class ExTres {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação? ");
		doacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 59) {
			System.out.printf("\n%s está apto/a para doar sangue! ", nome);
		}
		else if(idade >= 60 && idade <= 69) {
			if(doacao) {
				System.out.printf("\n%s não está apto/a para doar sangue! ", nome);
			}else{
				System.out.printf("\n%s está apto/a para doar sangue! ", nome);
			}
		}else {
			System.out.printf("\n%s não está apto/a para doar sangue! ", nome);
		}
	}
}
