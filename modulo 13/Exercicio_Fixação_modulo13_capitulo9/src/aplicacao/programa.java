package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.OrdemItem;
import entidade.Order;
import entidade.Product;
import entidade.enums.OrdemStatus;

public class programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	System.out.println(" Entre com as informaçoes do cliente ");
	System.out.print(" Digite o nome do cliente");
	String nome = sc.next();
	System.out.print(" Digite o email do cliente ");
	String email = sc.next();
	System.out.print(" Digite a sua data de nascimento (DD/MM/YYYY)" );
	Date Datanasci = sdf.parse(sc.next());
	
	Cliente cliente = new Cliente(nome, email, Datanasci);
	
	System.out.print(" Status:");
	OrdemStatus status =  OrdemStatus.valueOf(sc.next());
	
	Order order = new Order(new Date(), status, cliente);
	
	System.out.println(" Digite a quantidade de produtos que serao comprados ");
	int Quntprod = sc.nextInt();
	
	for (int i = 1; i <= Quntprod; i++) {
		System.out.println(" Entre com as informaçoes do produto " + i);
		System.out.print(" Nome do produto: ");
		String nomePro = sc.next();
		System.out.print(" Preço do produto: ");
		double precoPro = sc.nextDouble();
		
		Product produto = new Product(nomePro, precoPro);
		
		System.out.print(" Digite a quantidade do produto: ");
		int proQuant = sc.nextInt();
		
		OrdemItem ordemitem = new OrdemItem(proQuant, precoPro, produto);
		order.addItem(ordemitem);	
		
	}
	
	
		System.out.println();
		System.out.println(" Sumario do produto ");
		System.out.println(order);
		
	
	
	
		sc.close();
	};

}
