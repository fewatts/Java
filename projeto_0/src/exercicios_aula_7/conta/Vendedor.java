package exercicios_aula_7.conta;

public class Vendedor extends Funcionario{
	private int comissao;
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	public Vendedor(String nome, String nascimento, String sexo, String cargo, String horario, int comissao) {
		super(nome, nascimento, sexo, cargo, horario);
		this.comissao = comissao;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Porcentagem de comissão: " + this.comissao + "%");
	}
}
