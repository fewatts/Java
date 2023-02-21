package exercicios_aula_7;

import exercicios_aula_7.conta.Produto;

public class Testaproduto {

	public static void main(String[] args) {
		Produto c_1 = new Produto("The last of us", "Playstation", 2009, 345.65f, "terror/drama");
		Produto c_2 = new Produto("Dead by daylight", "Xbox one", 2018, 432.65f, "Aventura/terror");
		
		c_1.visualizar();
		c_2.visualizar();

	}

}
