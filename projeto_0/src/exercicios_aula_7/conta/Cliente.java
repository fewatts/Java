package exercicios_aula_7.conta;

public class Cliente {
	private String nome;
	private String nascimento;
	private String id;
	private String sexo;
	private float salario;
	public Cliente(String nome, String nascimento, String id, String sexo, float salario) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.id = id;
		this.sexo = sexo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public void Visualizar() {
		System.out.println("ID: " + getId());
		System.out.println("Nome: "+ getNome());
		System.out.println("Nascimento: " + getNascimento());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Salário: " + getSalario());
	}
}