package codewars;

import java.util.Arrays;

public class SquareRoot {
    public static int squareSum(int[] n) {
        
        return Arrays.stream(n)
                .map(operand -> operand * operand)
                .reduce(0, Integer::sum);
    }

}
