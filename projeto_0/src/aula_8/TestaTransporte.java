package aula_8;

public class TestaTransporte {

	public static void main(String[] args) {
		Transporte t1 = new Transporte();
		Terrestre tr1 = new Terrestre(5, 4, 200.4f);
		Automovel tra1 = new Automovel(5, 4, 200.4f, "Amarelo", 2, 6);
		t1.visualizar();
		System.out.println("\n");
		tr1.visualizar();
		System.out.println("\n");
		tra1.visualizar();
		System.out.println("\n");
		t1.setCapacidade(345);
		tra1.setPlaca("567GHJ87");
		t1.visualizar();
		System.out.println("\n");
		tra1.visualizar();
		System.out.println("\n");
		tra1.mensagem();
		System.out.println("\n");
		tra1.mensagem("O carnaval acabou...");
	}

}
