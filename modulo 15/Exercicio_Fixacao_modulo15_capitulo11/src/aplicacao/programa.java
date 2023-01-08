package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidade.conta;
import exception.exceptionConta;

public class programa {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero da sua conta");
		int numero = sc.nextInt();
		System.out.print("Digite o seu nome");
		String nome = sc.next();
		System.out.print("Digite o seu deposito inicial");
		double depoInicial = sc.nextDouble();
		System.out.print("Digite o limite do seu saque");
		double saqLimite = sc.nextDouble();
			
		conta contausu = new conta(numero,nome,depoInicial,saqLimite);
	
		
		System.out.println();
		try {
		System.out.print("Digite o valor que vc quer sacar");
		double saque = sc.nextDouble();
		System.out.println();
		contausu.Saque(saque);		
		}
		catch(exceptionConta e) {
			System.out.println(e.getMessage());
		}	
		
		}
		catch(InputMismatchException e) {
			System.out.println("Erro no valor de entrada");
		}
		
	
	}
	
}
