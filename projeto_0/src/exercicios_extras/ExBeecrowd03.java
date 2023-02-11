package exercicios_extras;

import java.util.Scanner;

public class ExBeecrowd03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int hora = 0, min = 0, seg;
		
		System.out.println("Digite um número para converter em tempo: ");
		seg = leia.nextInt();
		
		while(seg > 60) {
			if(seg > 60) {
				seg -= 60;
				min += 1;
			}
			if(min == 60) {
				min -= 60;
				hora += 1;
			}
			
		}
		System.out.printf("Horas : Minutos : Segundos\n %d   :    %d   :   %d", hora, min, seg);

	}

}
