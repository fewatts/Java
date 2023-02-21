package exercicios_aula_7;

import exercicios_aula_7.conta.Ingresso;

public class testaIngresso {

	public static void main(String[] args) {
		Ingresso c_1 = new Ingresso("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-5343", 346.43f, "Hardfall");
		Ingresso c_2 = new Ingresso("Fernando", "sdfsgfd@gmail.com", "SVAHD7-gf-765456", 200.43f, "HÖR");
		
		c_1.visualizar();
		c_2.visualizar();

	}

}
