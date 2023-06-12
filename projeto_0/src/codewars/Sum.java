package codewars;

public class Sum {
    public static int summation(int n) {
        if (n <= 0)
            return 0;

        return (n * (n + 1) / 2);
    }
    public static void main(String[] args) {
        System.out.println(summation(10));
    }

}
