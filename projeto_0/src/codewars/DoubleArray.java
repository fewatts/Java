package codewars;

    import java.util.Arrays;

public class DoubleArray {
    public static int[] map(int[] arr) {
        
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

}
