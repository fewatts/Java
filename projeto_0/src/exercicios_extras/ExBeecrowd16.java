package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd16 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[][] array = buildArray(n);
            printArray(array);
            System.out.println();
        }

    }

    public static int[][] buildArray(int n) {
        int[][] array = new int[n][n];
        int start = 0;
        int end = n - 1;
        int num = 1;

        while (start <= end) {
            for (int i = start; i <= end; i++) {
                array[start][i] = num;
                array[end][i] = num;
                array[i][start] = num;
                array[i][end] = num;
            }
            start++;
            end--;
            num++;
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }

    }

}
