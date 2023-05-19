package testes_processo_seletivo;

import java.util.Scanner;

public class HackerRankPrintf {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String pal = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-14s %03d\n", pal, num);
        }
        System.out.println("================================");
    }

}
