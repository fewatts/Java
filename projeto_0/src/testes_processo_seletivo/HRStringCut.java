package testes_processo_seletivo;

import java.util.Scanner;

public class HRStringCut {
    static Scanner in = new Scanner(System.in);
    public static String smallestLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for(int i = 1; i < s.length() - k + 1; i++){
            String substr = s.substring(i, i + k);
            if(smallest.compareTo(substr) > 0)
                smallest = substr;
            if(largest.compareTo(substr) < 0)
                largest = substr;
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        String s = in.next();
        int k = in.nextInt();
        System.out.println(smallestLargest(s, k));
    }

}
