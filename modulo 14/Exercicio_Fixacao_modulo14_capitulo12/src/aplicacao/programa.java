package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Company;
import entidade.individual;
import entidade.taxPlayer;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<taxPlayer> list = new ArrayList<>();
		taxPlayer play = new taxPlayer();
		
		System.out.print("Quantos contribuintes vc vai querer ler? ");
		int res = sc.nextInt();
		
		for(int i = 0; i <= res; i++) {
			System.out.println(" Qual o nome do contribuinte? ");
			String nome = sc.next();
			System.out.println(" Qual a renda anual do contribuinte? ");
			Double renda = sc.nextDouble();
			System.out.println(" O contribuinte é fisico ou juridico? (f/j) ");
			char contribuinte = sc.next().charAt(0);
				
			if(contribuinte == 'f') {
				System.out.println(" Qual o gasto com saude do contribuinte? ");
				Double saude = sc.nextDouble();
				list.add(new individual(nome,renda,saude));
			}else {
				System.out.println(" Quantos funcionarios o contribuinte tem? ");
				int funcs = sc.nextInt();
				list.add(new Company(nome,renda,funcs));
			}
			
		}
		
		
		
		sc.close();

	}

}
