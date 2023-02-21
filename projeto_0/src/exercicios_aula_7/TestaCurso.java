package exercicios_aula_7;

import exercicios_aula_7.conta.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c_1 = new Curso("Fernando", "43534", "04/10/1999", "Pinheiros", "Java fullstack");
		Curso c_2 = new Curso("Angelo Tufo", "356455", "30/10/2017", "Paulista", "Jardineiro proeficiente");
		
		c_1.visualizar();
		c_2.visualizar();

	}

}
