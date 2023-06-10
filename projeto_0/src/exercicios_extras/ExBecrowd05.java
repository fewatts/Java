package exercicios_extras;

import java.util.Scanner;

public class ExBecrowd05 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = in.nextInt();
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
	
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

			}

		}

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println();

		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
