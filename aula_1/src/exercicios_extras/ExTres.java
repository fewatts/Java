package exercicios_extras;

import java.util.Scanner;

public class ExTres {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float km, litros;
		
		System.out.println("Quanl foi a distância percorrida? [KM] ");
		km = leia.nextFloat();
		
		System.out.println("Quantos litros de gasolina foram gastos? ");
		litros = leia.nextFloat();
		
		System.out.printf("A média de consumo foi de %.2f Litros por KM.", litros / km);
		
	}

}
