package testes_processo_seletivo;

import java.util.Scanner;

public class HrStrCapitalize {  
    static Scanner input = new Scanner(System.in);
    public static String cap(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static void main(String[] args) {
        String a = input.next();
        String b = input.next();
        
        System.out.println(a.length() + b.length());
        int i = a.compareTo(b);
        if(i > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(cap(a) + " " + cap(b));
    }

}
