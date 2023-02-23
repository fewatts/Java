package exercicios_aula_7.conta;

public class PessoaFisica extends Cliente{
	private String cpf;

	public PessoaFisica(String nome, String nascimento, String id, String sexo, float salario, String cpf) {
		super(nome, nascimento, id, sexo, salario);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void visualizar() {
		super.Visualizar();
		System.out.println("CPF: " + this.cpf);
	}	
}
