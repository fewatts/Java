package exercicios_aula_7.conta;

public class CursoLivre extends Curso{
	private String tipo;

	public CursoLivre(String nome, String matricula, String nascimento, String campus, String curso, String tipo) {
		super(nome, matricula, nascimento, campus, curso);
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
		System.out.println("Tipo de duração: " + this.tipo);
	}
}
