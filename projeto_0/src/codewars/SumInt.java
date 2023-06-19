package codewars;

public class SumInt {
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
