package exercicios_aula_7;

import exercicios_aula_7.conta.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente c_1 = new Cliente("Fernando Alves", "04/10/1999", "49802989864", "Masculino", 1723.24f);
		Cliente c_2 = new Cliente("Tiger head", "08/10/1996", "48794875695", "Feminino", 3558.98f);
		
		c_1.setSalario(45837.85f);
		c_2.setSalario(23432.54f);
		
		c_2.setNome("Dana montana");
		
		c_1.Visualizar();
		c_2.Visualizar();
	}

}
