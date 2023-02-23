package exercicios_aula_7.conta;

public class Gerente extends Funcionario{
	private String beneficio;
	public Gerente(String nome, String nascimento, String sexo, String cargo, String horario, String beneficio) {
		super(nome, nascimento, sexo, cargo, horario);
		this.beneficio = beneficio;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Benefício: " + this.beneficio);
	}
}
	