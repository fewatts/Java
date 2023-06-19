package codewars;

public class HighestAndLowest {
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

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
