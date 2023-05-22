package testes_processo_seletivo;

import java.util.Arrays;
import java.util.Scanner;

public class HrAnagrams {
    static Scanner in = new Scanner(System.in);
    static String anagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        String A = new String(c);
        String B = new String(d);

        if(A.equals(B)){
            return "Anagrams";
        }
        return "Not Anagrams";
    }
    public static void main(String[] args) {
        String a = in.next();
        String b = in.next();

        System.out.println(anagram(a, b));
    }

}
