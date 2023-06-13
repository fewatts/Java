package codewars;

import java.util.Arrays;

public class PosArraySum {
    public static int sum(int[] arr) {
        
        if(arr == null || arr.length == 0)
            return 0;
        
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }

}
