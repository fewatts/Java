package testes_processo_seletivo;

import java.util.Scanner;

public class HrForMath {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Repeat (int): ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("a: ");
            int a = sc.nextInt();
            System.out.println("b: ");
            int b = sc.nextInt();
            System.out.println("n: ");
            int n = sc.nextInt();
            System.out.println();
            int calc = a;
            for (int j = 0; j < n; j++) {
                calc += (Math.pow(2, j) * b);
                System.out.print(calc + " ");
            }
            System.out.println();
        }

    }

}
