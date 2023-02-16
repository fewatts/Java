package aula_6;

import static aula_6.pacote_2.Classe_2.*;

public class TestaMetodos {

	public static void main(String[] args) {
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		Classe_1.metodoPublic();
		Classe_1.metodoPadrao();
		Classe_1.metodoProtegido();
		//Classe_1.metodoPrivate();
		System.out.println(soma(5, 5));
		
		metodoPublic_();
		soma_(0, 0);
		/*
		metodoPadrao_();
		metodoProtegido_();
		metodoPrivado_();*/
	}
	static public void metodoPublic() {
		System.out.println("Eu sou um método público");
	}
	public static int soma(int a, int b) {
		return a + b;
	}
	static void metodoPadrao() {
		System.out.println("Eu sou um método friendly");
	}
	static protected void metodoProtegido() {
		System.out.println("Eu sou um método protected");
	}
	static private void metodoPrivado() {
		System.out.println("Eu sou um método private");
	}
}
