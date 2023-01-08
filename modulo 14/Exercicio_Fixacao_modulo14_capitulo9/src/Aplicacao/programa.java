package Aplicacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Entidade.ProdutoUsado;
import Entidade.produto;
import Entidade.produtoimportado;

public class programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		produto prod = new produto();
		List<produto> list = new ArrayList<>();
		
		System.out.print("Quantos produtos vc vai querer ");
		int res = sc.nextInt();
		
		for(int i = 1; i <= res; i++) {
			System.out.println("Produto " + i);
			System.out.print("Esse produto é um produto comum, usado ou importado (c/u/i)");
			char infProduto = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			if(infProduto == 'i') {
				System.out.print("Custo da importação: ");
				Double importacao = sc.nextDouble();
				list.add(new produtoimportado(nome,preco,importacao));
				
			}else if(infProduto == 'u' ) {
				System.out.print("Data da fatura (DD/MM/YYYY): ");
				Date fatura = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome,preco,fatura));
			}else {
				list.add(new produto(nome,preco));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(produto prode: list) {
			System.out.println(prode.getNome() + " - " + prode.priceTag());
		}
		
		
		
		
		
		
		
		
		
	}

}
