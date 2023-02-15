package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd14 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] vetor = new int[9];
		int t, ind = 0;
		
		System.out.println("Digite T: ");
		t = leia.nextInt();
		for(int i = 0; i < vetor.length; i++) {
			if(ind == t) {
				ind = 0;
				vetor[i] = ind;
				ind++;
			}else {
				vetor[i] = ind;
				ind++;
			}
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("N[%d] = %d\n", i, vetor[i]);
		}

	}

}
