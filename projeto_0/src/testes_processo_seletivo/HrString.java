package testes_processo_seletivo;

import java.util.Scanner;

public class HrString {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
    }
    
}
