package exercicios_aula_7.conta;

public class Cliente {
	private String nome;
	private String nascimento;
	private String cpf;
	private String sexo;
	private float salario;
	public Cliente(String nome, String nascimento, String cpf, String sexo, float salario) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		System.out.println("Nome: "+ getNome());
		System.out.println("Nascimento: " + getNascimento());
		System.out.println("CPF: " + getCpf());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Salário: " + getSalario() + "\n\n");
	}
}
