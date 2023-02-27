package aula_11;

import java.util.Scanner;

public class Calculadora {

    static Scanner leia = new Scanner(System.in);

    public static int calcular(OperacaoMatematica om, int num1, int num2){
        return om.executar(num1, num2);
    }
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();

        System.out.println("A soma dos dois valores é: " + calcular((a, b) -> a + b, num1, num2));

    }
    
}
