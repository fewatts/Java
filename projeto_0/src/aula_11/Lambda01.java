package aula_11;

import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibir os itens\n");
		
		// Exibir os itens da Lista sem Expressão Lambda
		for(Integer n : numeros) {
			System.out.println(n);
		}

		System.out.println("\nExibir os itens somados com eles mesmos\n");
		
		// Exibir os itens da Lista dobrados sem Expressão Lambda
		for(Integer n : numeros) {
			System.out.println(n + n);
		}

        // Exibir apenas os elementos pares da Lista sem Expressão Lambda
        System.out.println("\nExibir os itens pares da lista\n");
		for(Integer n : numeros) {
			if(n % 2 == 0)
			System.out.println(n);
		}

         //usando expressão Lambda
        System.out.println("Exibindo os números com Lambda\n");
        numeros.forEach(n -> System.out.println(n + n));

		
        //usando expressão Lambda
        //os if´s seguem a mesma regra(mais de uma linha -> abre chaves)
        System.out.println("Números pares com Lambda\n");
        numeros.forEach(n -> {
            if(n % 2 == 0)
                System.out.println(n);
        });

	}

}
