package exercicios_aula_7.conta;

public class Funcionario {
	private String nome;
	private String nascimento;
	private String sexo;
	private String cargo;
	private String horario;
	public Funcionario(String nome, String nascimento, String sexo, String cargo, String horario) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.cargo = cargo;
		this.horario = horario;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void visualizar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Nascimento: " + getNascimento());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Horário: " + getHorario() + "\n\n");
	}
}
