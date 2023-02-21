package exercicios_aula_7.conta;

public class Farmacia {
	private String nome;
	private String estado;
	private String principio_ativo;
	private String tipo;
	private String validade;
	public Farmacia(String nome, String estado, String principio_ativo, String tipo, String validade) {
		this.nome = nome;
		this.estado = estado;
		this.principio_ativo = principio_ativo;
		this.tipo = tipo;
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPrincipio_ativo() {
		return principio_ativo;
	}
	public void setPrincipio_ativo(String principio_ativo) {
		this.principio_ativo = principio_ativo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void Visualizar() {
		System.out.println("Nome: "+ getNome());
		System.out.println("estado: " + getEstado());
		System.out.println("Princípio ativo: " + getPrincipio_ativo());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Validade: " + getValidade() + "\n\n");
	}
	
}
