package exercicios_aula_7;

import exercicios_aula_7.conta.Cliente;
import exercicios_aula_7.conta.PessoaFisica;
import exercicios_aula_7.conta.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c_1 = new Cliente("Fernando Alves", "04/10/1999", "87545", "Masculino", 1723.24f);
		Cliente c_2 = new Cliente("Tiger head", "08/10/1996", "755675", "Feminino", 3558.98f);
		
		c_1.setSalario(45837.85f);
		c_2.setSalario(23432.54f);
		
		c_2.setNome("Dana montana");
		
		c_1.Visualizar();
		System.out.println("\n");
		c_2.Visualizar();
		PessoaFisica c_3 = new PessoaFisica("Fernando Alves", "04/10/1999", "765456", "Masculino", 1723.24f, "83958392837");
		PessoaFisica c_4 = new PessoaFisica("Tiger head", "08/10/1996", "76543456", "Feminino", 3558.98f, "83746387465");
		PessoaJuridica c_5 = new PessoaJuridica("Fernando Alves", "04/10/1999", "65445", "Masculino", 1723.24f, "85939885993");
		PessoaJuridica c_6 = new PessoaJuridica("Tiger head", "08/10/1996", "87655", "Feminino", 3558.98f, "98374382");
		
		System.out.println("\n");
		c_3.visualizar();
		System.out.println("\n");
		c_4.visualizar();
		System.out.println("\n");
		c_5.visualizar();
		System.out.println("\n");
		c_6.visualizar();
		
	}

}
