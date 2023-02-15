package aula_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elisangela");
		System.out.println();
		
		Iterator<String> iFila = fila.iterator();
		
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
		}
		System.out.println();
		System.out.println("Retirar um elemento da fila: ");
		System.out.println(fila.poll());
		System.out.println();
		System.out.println("Fila atualizada: ");
		for(var elem : fila){
			System.out.println(elem);
		}
		System.out.println();
		System.out.println(fila.peek());
		System.out.println();
		System.out.println(fila.size());
	}

}
