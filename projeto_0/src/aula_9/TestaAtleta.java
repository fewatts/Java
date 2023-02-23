package aula_9;

public class TestaAtleta {

	public static void main(String[] args) {
		Triatleta at1 = new Triatleta("Fernando");
		Triatleta at2 = new Triatleta("Wallace");
		
		System.out.println(at1.getNome());
		at1.aquecer();
		at1.correr();
		System.out.println("\n");
		System.out.println(at2.getNome());
		at2.aquecer();
		at2.pedalar();
		at2.nadar();
	}

}
