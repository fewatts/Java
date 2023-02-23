package exercicios_aula_7;

import exercicios_aula_7.conta.Ingresso;
import exercicios_aula_7.conta.MeiaEntrada;
import exercicios_aula_7.conta.Vip;

public class testaIngresso {

	public static void main(String[] args) {
		Ingresso c_1 = new Ingresso("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-5343", 346.43f, "Hardfall");
		Ingresso c_2 = new Ingresso("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-765456", 200.43f, "HÖR");
		
		c_1.visualizar();
		System.out.println("\n");
		c_2.visualizar();
		System.out.println("\n");
		
		Vip vip = new Vip("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-5343", 120.0f, "Hardfall", "F");
	    MeiaEntrada meia = new MeiaEntrada("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-765456", 50.0f, "HÖR", "Estudante");
	    
	    vip.visualizar();
		System.out.println("\n");
		meia.visualizar();
		System.out.println("\n");
	}

}
