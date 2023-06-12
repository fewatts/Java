package codewars;

import java.util.Arrays;

public class ArraySum {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[0];

        int countPositives = (int) Arrays.stream(input)
                .filter(num -> num > 0).count();

        int sumNegatives = (int) Arrays.stream(input)
                .filter(num -> num < 0).sum();

        return new int[] { countPositives, sumNegatives };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                countPositivesSumNegatives(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 })));
    }

}
