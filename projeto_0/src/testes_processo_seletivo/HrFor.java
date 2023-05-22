package testes_processo_seletivo;

import java.util.Scanner;

public class HrFor {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a integer number: ");
        int N = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
    
    }

}
