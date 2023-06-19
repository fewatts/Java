package codewars;

import java.util.Arrays;

public class ReverseArray {
    public static int[] digitize(long n) {
        String numStr = String.valueOf(n);
        int[] array = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            array[i] = Character.getNumericValue(numStr.charAt(numStr.length() - 1 - i));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
    }

}
