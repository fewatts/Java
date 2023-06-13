package codewars;

import java.util.Arrays;

public class AverageArray {
    public static double find_average(int[] array) {

        if (array.length == 0 || array == null)
            return 0.0;

        return Arrays.stream(array).average().orElse(0);

    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[] { 1, 2, 3 }));
    }

}
