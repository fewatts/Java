package exercicios_aula_3;

import java.util.Scanner;

public class ExQuatro {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, sex, categ, dev_back = 0, dev_m_front = 0, mob_m_maior = 0, dev_full_f_men = 0;
		boolean resp = false;
		String resp_ = "";
		
		while(resp == false) {

			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println("1-Masculino\n2-Feminino\n3-Outros\n");
			System.out.println("Sexo: ");
			sex = leia.nextInt();
			System.out.println("1-Backend\n2-Frontend\n3-Mobile\n4-FullStack\n");
			System.out.println("Categoria: ");
			categ = leia.nextInt();
			
			if(categ == 1)
				dev_back += 1;
			if(sex == 2 && categ == 2)
				dev_m_front += 1;
			if(sex == 1 && categ == 3 && idade > 40)
				mob_m_maior += 1;
			if(sex == 2 && categ == 4 && idade < 30)
				dev_full_f_men += 1;
			
			System.out.println("Deseja continuar? [S/N] ");
			leia.skip("\\R?");
			resp_ = leia.nextLine();
			
			if(resp_.equalsIgnoreCase("N")) {
				resp = true;
			}
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: "+ dev_back);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+ dev_m_front);
		System.out.println("Total de homens desenvolvedores mobile com mais de 40 anos: "+ mob_m_maior);
		System.out.println("Total de mulheres desenvolvedoras FullStack: "+ dev_full_f_men);
		
	}

}
