package Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends produto {
	
	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public ProdutoUsado(String nome, Double preco, Date manufactureDate) {
		super(nome, preco);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public String priceTag() {
		return "(usado)  Custo do produto $" + getPreco() + " Data da fatura " + sdf.format(manufactureDate);
	}

}
