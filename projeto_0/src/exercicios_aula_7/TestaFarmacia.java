package exercicios_aula_7;

import exercicios_aula_7.conta.Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia c_1 = new Farmacia("tarja preta", "Sólido", "Ritalina", "Genérico", "21/02/2024");
		Farmacia c_2 = new Farmacia("Alektos", "Sólido", "Bilastina", "Genérico", "04/10/2024");
		
		c_1.Visualizar();
		c_2.Visualizar();

	}

}
