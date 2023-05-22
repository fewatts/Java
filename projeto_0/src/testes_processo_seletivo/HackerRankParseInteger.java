package testes_processo_seletivo;

import java.util.Scanner;

public class HackerRankParseInteger {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        
        String s = Integer.toString(n);
        
        if(n == Integer.parseInt(s)){
            System.out.println("Good job");    
        }else{
            System.out.println("Wrong answer");
        }
        
    }
    
}
