package aula_6;

public class TestaMetodos {

	public static void main(String[] args) {
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		System.out.println(soma(5, 5));
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
