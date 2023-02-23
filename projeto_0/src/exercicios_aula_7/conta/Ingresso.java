package exercicios_aula_7.conta;

public class Ingresso {
	private String titular;
	private String email;
	private String numero;
	private float valor;
	private String organizador;
	public Ingresso(String titular, String email, String numero, float valor, String organizador) {
		this.titular = titular;
		this.email = email;
		this.numero = numero;
		this.valor = valor;
		this.organizador = organizador;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	public void visualizar() {
		System.out.println("Titular: "+ getTitular());
		System.out.println("E-mail: " + getEmail());
		System.out.println("Número do ingresso: " + getNumero());
		System.out.println("Valor: " + getValor());
		System.out.println("Organizador: " + getOrganizador());
	}
}

