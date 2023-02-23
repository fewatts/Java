package exercicios_aula_7.conta;

public class Curso {
	private String nome;
	private String matricula;
	private String nascimento;
	private String campus;
	private String curso;
	public Curso(String nome, String matricula, String nascimento, String campus, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nascimento = nascimento;
		this.campus = campus;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void visualizar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Data de nascimento: " + getNascimento());
		System.out.println("Campus: " + getCampus());
		System.out.println("Curso: " + getCurso());
	}
}
