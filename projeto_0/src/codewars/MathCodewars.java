package codewars;

import java.util.Arrays;
import java.util.Objects;

/**
 * A utility class containing various mathematical operations on arrays and
 * numbers.
 */
public class MathCodewars {

    /**
     * Returns the minimum and maximum values from an integer array.
     *
     * @param arr The input integer array.
     * @return An integer array containing the minimum and maximum values from the
     *         input array.
     */
    public static int[] minMax(int[] arr) {
        if (arr == null || arr.length == 0)
            return new int[0];

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] { min, max };
    }

    /**
     * Calculates the sum of values in a double array.
     *
     * @param numbers The input double array.
     * @return The sum of values in the array.
     */
    public static double sum(double[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0.0;

        return Arrays.stream(numbers).sum();
    }

    /**
     * Counts the number of positive values and calculates the sum of negative
     * values in an integer array.
     *
     * @param input The input integer array.
     * @return An integer array containing the count of positive values and the sum
     *         of negative values.
     */
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[0];

        int countPositives = (int) Arrays.stream(input)
                .filter(num -> num > 0).count();

        int sumNegatives = (int) Arrays.stream(input)
                .filter(num -> num < 0).sum();

        return new int[] { countPositives, sumNegatives };
    }

    /**
     * Calculates the average of values in an integer array.
     *
     * @param array The input integer array.
     * @return The average value of the elements in the array.
     */
    public static double find_average(int[] array) {
        if (array == null || array.length == 0)
            return 0.0;

        return Arrays.stream(array).average().orElse(0);
    }

    /**
     * Compares the average of an integer array with a given integer value.
     *
     * @param classPoints The input integer array representing class points.
     * @param yourPoints  The input integer representing your points.
     * @return true if your points are greater than the average of class points,
     *         false otherwise.
     */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        if (classPoints == null || classPoints.length == 0)
            return false;

        double average = Arrays.stream(classPoints).average().orElse(0);
        return average < yourPoints;
    }

    /**
     * Calculates the Body Mass Index (BMI) and returns the corresponding condition.
     *
     * @param weight The weight of the individual.
     * @param height The height of the individual.
     * @return A string representing the condition based on the BMI calculation.
     */
    public static String bmi(double weight, double height) {
        double calc = weight / (height * height);

        if (calc <= 18.5)
            return "Underweight";
        else if (calc <= 25)
            return "Normal";
        else if (calc <= 30)
            return "Overweight";
        else
            return "Obese";
    }

    /**
     * Calculates the distance to the next fuel station and returns true if it's
     * possible to reach it with the remaining fuel.
     *
     * @param distanceToPump The distance to the next fuel station.
     * @param mpg            The miles per gallon (fuel efficiency).
     * @param fuelLeft       The remaining fuel in gallons.
     * @return true if it's possible to reach the next fuel station with the
     *         remaining fuel, false otherwise.
     */
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (mpg * fuelLeft) >= distanceToPump;
    }

    /**
     * Calculates the century based on the given year.
     *
     * @param number The input year.
     * @return The century corresponding to the given year.
     */
    public static int century(int number) {
        int century = number / 100;
        if (number % 100 != 0) {
            century++;
        }
        return century;
    }

    /**
     * Generates an array of multiples of 'x' up to 'n' elements.
     *
     * @param x The number whose multiples are generated.
     * @param n The number of multiples to generate.
     * @return An integer array containing 'n' multiples of 'x'.
     */
    public static int[] countBy(int x, int n) {
        int[] multiples = new int[n];

        for (int i = 0; i < n; i++) {
            multiples[i] = x * (i + 1);
        }

        return multiples;
    }

    /**
     * Maps each element of the input integer array to a new array where each
     * element is multiplied by 2.
     *
     * @param arr The input integer array.
     * @return A new integer array with each element multiplied by 2.
     */
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    /**
     * Finds the highest and lowest integer values from a space-separated string of
     * numbers.
     *
     * @param numbers The input string containing space-separated numbers.
     * @return A string representation of the highest and lowest numbers separated
     *         by a space.
     */
    public static String highAndLow(String numbers) {
        String[] numArray = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String num : numArray) {
            int currentNum = Integer.parseInt(num);
            max = Math.max(max, currentNum);
            min = Math.min(min, currentNum);
        }

        return max + " " + min;
    }

    /**
     * Converts a given positive integer to its negative equivalent.
     *
     * @param x The input integer.
     * @return The negative value of the input integer if it is positive, otherwise
     *         returns the input integer itself.
     */
    public static int makeNegative(final int x) {
        return x <= 0 ? x : -x;
    }

    /**
     * Determines whether a given integer is even or odd.
     *
     * @param number The input integer.
     * @return "Even" if the number is even, "Odd" if the number is odd.
     */
    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    /**
     * Calculates the area of a rectangle given its width and height.
     *
     * @param n The width of the rectangle.
     * @param m The height of the rectangle.
     * @return The area of the rectangle, or 0 if either width or height is
     *         negative.
     */
    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }

    /**
     * Sums all positive elements in the input integer array.
     *
     * @param arr The input integer array.
     * @return The sum of all positive elements in the array.
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }

    /**
     * Counts the number of error characters (characters outside the range 'a' to
     * 'm') in a string.
     *
     * @param s The input string.
     * @return A string representation of the error count and the total length of
     *         the input string.
     */
    public static String printerError(String s) {
        int errors = 0;

        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'm')
                errors++;
        }
        return errors + "/" + s.length();
    }

    /**
     * Converts a long integer into an array of its digits in reverse order.
     *
     * @param n The input long integer.
     * @return An integer array containing the digits of the long integer in reverse
     *         order.
     */
    public static int[] digitize(long n) {
        String numStr = String.valueOf(n);
        int[] array = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            array[i] = Character.getNumericValue(numStr.charAt(numStr.length() - 1 - i));
        }
        return array;
    }

    /**
     * Counts the number of true (non-null and true value) elements in a Boolean
     * array.
     *
     * @param arrayOfSheeps The input Boolean array.
     * @return The count of true elements in the Boolean array.
     */
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        long count = Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue)
                .count();

        return (int) count;
    }

    /**
     * Calculates the sum of squares of all elements in the input integer array.
     *
     * @param n The input integer array.
     * @return The sum of squares of all elements in the array.
     */
    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(operand -> operand * operand)
                .reduce(0, Integer::sum);
    }

    /**
     * Calculates the sum of integers from a to b (inclusive).
     *
     * @param a The starting integer.
     * @param b The ending integer.
     * @return The sum of integers from a to b (inclusive).
     */
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int sum = 0, start = 0, end = 0;

            if (a > b) {
                start = b;
                end = a;
            } else {
                start = a;
                end = b;
            }
            for (int i = start; i <= end; i++) {
                sum += i;
            }

            return sum;
        }

    }

}
