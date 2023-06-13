package codewars;

import java.util.Arrays;

public class AverageComparator {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        if (classPoints == null || classPoints.length == 0 )
            return false;
        
        double average = Arrays.stream(classPoints).average().orElse(0);    
        return average < yourPoints;
    }

}
