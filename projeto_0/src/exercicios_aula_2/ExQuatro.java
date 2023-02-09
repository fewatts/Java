package exercicios_aula_2;

import java.util.Scanner;

public class ExQuatro {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String tipo_1, tipo_2, tipo_3;
		
		System.out.printf("\nResposta [Tipo 1]:");
		leia.skip("\\R?");
		tipo_1 = leia.nextLine();
		
		System.out.printf("\nResposta[Tipo 2]:");
		leia.skip("\\R?");
		tipo_2 = leia.nextLine();
		
		System.out.printf("\nResposta[Tipo 3]:");
		leia.skip("\\R?");
		tipo_3 = leia.nextLine();
		
		if(tipo_1.equals("vertebrado")) {
			if(tipo_2.equals("mamifero")) {
				if(tipo_3.equals("onivoro")) {
					System.out.println("É Homem");
				}
				if(tipo_3.equals("herbivoro")) {
					System.out.println("É vaca");
				}
			}
			if(tipo_2.equals("ave")) {
				if(tipo_3.equals("carnivoro")) {
					System.out.println("É aguia");
				}
				if(tipo_3.equals("onivora")) {
					System.out.println("É pomba");
				}
			}
		}else{
			if(tipo_2.equals("inseto")) {
				if(tipo_3.equals("hematofago")) {
					System.out.println("É pulga");
				}
				if(tipo_3.equals("herbivoro")) {
					System.out.println("É Lagarta");
				}
			}
			if(tipo_2.equals("anelidio")) {
				if(tipo_3.equals("hematofago")) {
					System.out.println("É sanguessuga");
				}
				if(tipo_3.equals("onivoro")) {
					System.out.println("É minhoca");
	             }
	          }
           }
    }
}
