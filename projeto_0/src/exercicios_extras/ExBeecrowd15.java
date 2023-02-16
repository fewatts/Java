package exercicios_extras;

import java.util.Random;

public class ExBeecrowd15 {
	
	static Random random = new Random();

	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for(int i = 0; i < vetor.length; i++) {
			int num = random.nextInt(100);
			vetor[i] = num;
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] <= 10)
				System.out.printf("A[%d] = %d\n", i, vetor[i]);
		}

	}

}
