package codewars;

import java.util.Arrays;

public class CountByX {
    public static int[] countBy(int x, int n) {
        int[] multiples = new int[n];

        for (int i = 0; i < n; i++) {
            multiples[i] = x * (i + 1);
        }

        return multiples;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2, 10)));
    }

}
