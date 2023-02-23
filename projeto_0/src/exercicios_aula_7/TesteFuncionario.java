package exercicios_aula_7;

import exercicios_aula_7.conta.Funcionario;
import exercicios_aula_7.conta.Gerente;
import exercicios_aula_7.conta.Vendedor;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f_1 = new Funcionario("Angelo Tufo", "30/10/2017", "Maculino", "Jardineiro", "Noturno");
		Funcionario f_2 = new Funcionario("Fernando Alves", "04/10/1999", "Maculino", "Dev Java Jr.", "Integral");
		
		f_1.setHorario("Matutino");
		
		f_1.visualizar();
		System.out.println("\n");
		f_2.visualizar();
		System.out.println();
		
		Gerente f_3 = new Gerente("Angelo Tufo", "30/10/2017", "Maculino", "Jardineiro", "Noturno", "Auxílio financiamento de carro");
		Vendedor f_4 = new Vendedor("Fernando Alves", "04/10/1999", "Maculino", "Dev Java Jr.", "Integral", 30);
		Vendedor f_5 = new Vendedor("Angelo Tufo", "30/10/2017", "Maculino", "Jardineiro", "Noturno", 23);
		
		f_3.visualizar();
		System.out.println();
		f_4.visualizar();
		System.out.println();
		f_5.visualizar();
	}
}
