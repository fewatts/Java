package testes_processo_seletivo;

import java.util.Scanner;

public class HrSysout {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        final double pi = scanner.nextDouble();
        scanner.skip("\\R?");
        String pal = scanner.nextLine();

        System.out.println("String: " + pal);
        System.out.println("Double: " + pi);
        System.out.println("Int: " + num);
    }

}
