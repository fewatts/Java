package exercicios_aula_7.conta;

public class Produto {
	private String nome;
	private String plataforma;
	private int ano;
	private float preco;
	private String genero;
	public Produto(String nome, String plataforma, int ano, float preco, String genero) {
		super();
		this.nome = nome;
		this.plataforma = plataforma;
		this.ano = ano;
		this.preco = preco;
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Ano: " + this.ano);
		System.out.println("Preço: " + this.preco);
		System.out.println("Gênero: " + this.genero + "\n");
	}
}
