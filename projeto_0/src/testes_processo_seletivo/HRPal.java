package testes_processo_seletivo;

import java.util.Scanner;

public class HRPal {
    static Scanner in = new Scanner(System.in);
    public static boolean palindrome(String str){
        boolean palindrome = true;
        for(int i = 0; i < str.length(); i++){
            if(!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1,str.length() -i))){
                palindrome = false;
            }

        }
        return palindrome;
    }
    public static void main(String[] args) {
        String str = in.next();
        if(palindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
