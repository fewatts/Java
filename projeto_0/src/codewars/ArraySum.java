package codewars;

import java.util.Arrays;

public class ArraySum {
    public static double sum(double[] numbers) {
        
        if(numbers.length == 0 || numbers == null)
            return 0.0;

        return Arrays.stream(numbers)
                .sum();
    }

}
