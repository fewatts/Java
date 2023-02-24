package aula_10;

public class MinhaExcecao extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1l;
	public MinhaExcecao() {}
	
	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}
}
