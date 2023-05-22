package testes_processo_seletivo;

import java.util.Scanner;

public class TestBH {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int B = 0, H = 0;
        B = sc.nextInt();
        H = sc.nextInt();   
        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(B * H);
        } 

    }
    
}
