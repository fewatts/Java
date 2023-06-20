package codewars;

import java.util.Arrays;

public class LongestNoRepeat {
    public static String longest(String s1, String s2) {
        String concatStr = s1 + s2;
        char[] longestArray = concatStr.toCharArray();
        Arrays.sort(longestArray);

        StringBuilder distinctString = new StringBuilder();
        char previousChar = '\0'; 


        for(var c : longestArray){
            if (c != previousChar) {
                distinctString.append(c);
                previousChar = c;
            }

        }
        return distinctString.toString();
    }

    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a, b));
    }

}
