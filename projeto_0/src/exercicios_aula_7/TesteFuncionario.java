package exercicios_aula_7;

import exercicios_aula_7.conta.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f_1 = new Funcionario("Angelo Tufo", "30/10/2017", "Maculino", "Jardineiro", "Noturno");
		Funcionario f_2 = new Funcionario("Fernando Alves", "04/10/1999", "Maculino", "Dev Java Jr.", "Integral");
		
		f_1.setHorario("Matutino");
		
		f_1.visualizar();
		f_2.visualizar();
	}
}
