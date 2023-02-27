package aula_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosDesordenados = Arrays.asList(4, 5, 7, 3, 1, 2, 6, 8, 10, 9);
        List<String> estados = Arrays.asList("São paulo", "Rio de janeiro", "Minas gerais", "São paulo", "Rio de janeiro", "Minas gerais", "São paulo", "Rio de janeiro");
        List<String> estados2 = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");



        System.out.println("\nExemplo - método map");
        List<Integer> numerosAoCubo = numeros.stream()
            .map(x -> x * x * x)
            .collect(Collectors.toList());
        System.out.println("Números elevados ao cubo: " + numerosAoCubo);
        System.out.println("\n");

        System.out.println("\nExemplo - método filter");
        List<Integer> numerosPares = numeros.stream()
            .filter(x -> x % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);
        System.out.println("\n");

        List<Integer> numerosAsc = numerosDesordenados.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Números em ordem crescente: " + numerosAsc);
        System.out.println("\n");

        List<Integer> numerosDesc = numeros.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println("Números em ordem crescente: " + numerosDesc);
        System.out.println("\n");

        List<String> estadosDuplicados = estados.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Estados Duplicados: " + estadosDuplicados);
        System.out.println("\n");

        Long estadosIniciamComR = estados2.stream()
            .filter(x -> x.toString().startsWith("R"))
            .count();
        System.out.println("O número de estados com letra R: " + estadosIniciamComR);
        System.out.println("\n");
    }

}
