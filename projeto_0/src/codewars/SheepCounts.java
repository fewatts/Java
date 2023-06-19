package codewars;

import java.util.Arrays;
import java.util.Objects;

public class SheepCounts {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        long count = Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue)
                .count();

        return (int) count;
    }

}
