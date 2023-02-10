package exercicios_aula_3;

import java.util.Scanner;

public class ExQuatro {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 0, sex = 0, categ = 0, dev_back = 0, dev_front = 0, dev_mobile = 0, dev_full = 0;
		boolean resp = false;
		String resp_ = "";
		
		while(resp == false) {
			boolean idade_ = false, sexo_ = false, cate_ = false;

			while(idade_ == false) {
				System.out.println("Idade: ");
				idade = leia.nextInt();
				if(idade > 0 && idade < 120)
					idade_ = true;
			}
			while(sexo_ == false) {
				System.out.println("1-Masculino\n2-Feminino\n3-Outros\n");
				System.out.println("Sexo: ");
				sex = leia.nextInt();
				if(sex >=1 && sex <= 3) {
					sexo_ = true;
				}
			}
			while(cate_ == false) {
				System.out.println("1-Backend\n2-Frontend\n3-Mobile\n4-FullStack\n");
				System.out.println("Categoria: ");
				categ = leia.nextInt();
				if(categ > 0 && categ < 5) {
					cate_ = true;
				}
			}
			
			if(categ == 1)
				dev_back += 1;
			if(sex == 2 && categ == 2)
				dev_front += 1;
			if(sex == 1 && categ == 3 && idade > 40)
				dev_mobile += 1;
			if(sex == 2 && categ == 4 && idade < 30)
				dev_full += 1;
			
			System.out.println("Deseja continuar? [S/N] ");
			leia.skip("\\R?");
			resp_ = leia.nextLine();
			
			if(resp_.equalsIgnoreCase("N")) {
				resp = true;
			}else
				resp = false;
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: "+ dev_back);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+ dev_front);
		System.out.println("Total de homens desenvolvedores mobile com mais de 40 anos: "+ dev_mobile);
		System.out.println("Total de mulheres desenvolvedoras FullStack: "+ dev_full);
		
	}

}
