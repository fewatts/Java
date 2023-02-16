package aula_6.pacote_2;

public class Classe_2 {
	public static void metodoPublic_() {
		System.out.println("Eu sou um Método Público!");
	}
	
	public static int soma_(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao_() {
		System.out.println("Eu sou um Método Friendly!");
	}
	
	protected static void metodoProtegido_() {
		System.out.println("Eu sou um Método Protegido!");
	}
	
	private static void metodoPrivado_() {
		System.out.println("Eu sou um Método Privado!");
	}

}
