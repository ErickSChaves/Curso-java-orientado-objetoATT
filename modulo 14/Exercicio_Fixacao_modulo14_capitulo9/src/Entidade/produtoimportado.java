package Entidade;

public class produtoimportado extends produto {
	
	private Double customsFree;

	
	
	
	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}

	public produtoimportado(Double customsFree) {
		this.customsFree = customsFree;
	}

	public produtoimportado(String nome, Double preco, Double customsFree) {
		super(nome, preco);
		this.customsFree = customsFree;
	}
	
	public double PrecoTotal(Double preco, Double customsFree) {
		double r = customsFree;
		return preco = preco + r;
	}
	
	@Override
	public String priceTag() {
		return " Preço do produto $" + PrecoTotal(preco,customsFree) + " Custo da importação: $" + getCustomsFree() ;
	}
	

}
