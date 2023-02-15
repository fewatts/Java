package aula_5;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(3.0);
		notas.add(8.0);
		
		System.out.println("Listando todas as notas: ");
		System.out.println();
		notas.forEach(System.out::println);
		System.out.println();
		System.out.println("Removendo nota: ");
		notas.remove(3.0);
		System.out.println();
		notas.forEach(System.out::println);
		System.out.println();
		System.out.println("A nota 7 existe? " + notas.contains(7.0));
		System.out.println();
		for(var nota : notas) {
			System.out.println(nota.hashCode(nota));
		}
		
	}

}
