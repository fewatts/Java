package exercicios_aula_7;

import exercicios_aula_7.conta.Curso;
import exercicios_aula_7.conta.CursoLivre;
import exercicios_aula_7.conta.Especializacao;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c_1 = new Curso("Fernando", "43534", "04/10/1999", "Pinheiros", "Java fullstack");
		Curso c_2 = new Curso("Angelo Tufo", "356455", "30/10/2017", "Paulista", "Jardineiro proeficiente");
		
		c_1.visualizar();
		System.out.println("\n");
		c_2.visualizar();
		System.out.println("\n");
		
		CursoLivre c_3 = new CursoLivre("Fernando", "43534", "04/10/1999", "Pinheiros", "Java fullstack", "curto");
		CursoLivre c_4 = new CursoLivre("Fernando", "87654456", "04/10/1999", "Paulista", "Scrum master", "curto");
		
		Especializacao c_5 = new Especializacao("Angelo Tufo", "356455", "30/10/2017", "Paulista", "Jardineiro proeficiente", "MBA");
		
		c_3.visualizar();
		System.out.println("\n");
		c_4.visualizar();
		System.out.println("\n");
		c_5.visualizar();
	}

}
