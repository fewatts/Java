package aula_4;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		/*int Vetor_[] = {1,2,3,4,5};
		
		for(int c = 0; c < Vetor_.length; c++) {
			System.out.printf("posição: %d ; valor: %d\n",c , Vetor_[c]);
		}*/
		float Vetor[] = new float[5];
		
		for(int c = 0; c < Vetor.length; c++) {
			System.out.printf("Digite a %d posição: ", c);
			Vetor[c] = leia.nextFloat();
		}
		Arrays.sort(Vetor);
		for(var num : Vetor) {
			System.out.printf("Valor: %.2f\n", num);
		}
		
		
	}

}
