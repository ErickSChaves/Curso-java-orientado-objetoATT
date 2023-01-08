package entidade;


public class OrdemItem {

	
	private int quantidade;
	private double preço;
	private Product produto;
	

	public OrdemItem(int quantidade, double preço, Product produto) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double subTotal() {
		return preço * quantidade;		
	}


	@Override
	public String toString() {
		return	produto.getNome() + " - " + String.format("%.2f", preço) +", Quantidade: " + quantidade + " Valor Total: " + String.format("%.2f",subTotal());
	}


}
