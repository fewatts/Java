package exercicios_aula_7.conta;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	public PessoaJuridica(String nome, String nascimento, String id, String sexo, float salario, String cnpj) {
		super(nome, nascimento, id, sexo, salario);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void visualizar() {
		super.Visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
}
