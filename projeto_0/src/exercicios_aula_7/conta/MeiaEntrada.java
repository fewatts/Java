package exercicios_aula_7.conta;

public class MeiaEntrada extends Ingresso{
	private String tipo;

	public MeiaEntrada(String titular, String email, String numero, float valor, String organizador, String tipo) {
		super(titular, email, numero, valor, organizador);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de Meia entrada: " + this.tipo);
	}
}
