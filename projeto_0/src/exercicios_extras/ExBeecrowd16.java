package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd16 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
        int n = in.nextInt();
    
        int[][] matriz = buildMatriz(n);
        printMatriz(matriz);
        System.out.println();
    }

    public static int[][] buildMatriz(int n) {
        int[][] matriz = new int[n][n];
        int start = 0;
        int end = n - 1;
        int num = 1;

        while (start <= end) {
            for (int i = start; i <= end; i++) {
                matriz[start][i] = num;
                matriz[end][i] = num;
                matriz[i][start] = num;
                matriz[i][end] = num;
            }
            start++;
            end--;
            num++;
        }
        return matriz;
    }

    public static void printMatriz(int[][] matriz) {
        for (int[] row : matriz) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }

    }

}
