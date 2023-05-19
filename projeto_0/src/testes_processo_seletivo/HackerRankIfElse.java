package testes_processo_seletivo;

import java.util.Scanner;

public class HackerRankIfElse {

    static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        if(n % 2 != 0 || n % 2 == 0 && n >= 6 && n <= 20){
            System.out.println("Weird");
        }else if(n % 2 == 0 && n >= 2 && n <= 5 || n % 2 == 0 && n >= 20){
            System.out.println("Not Weird");   
        }
        
    }

}
