package entidade;


public class OrdemItem {

	
	private int quantidade;
	private double pre�o;
	private Product produto;
	

	public OrdemItem(int quantidade, double pre�o, Product produto) {
		this.quantidade = quantidade;
		this.pre�o = pre�o;
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public double subTotal() {
		return pre�o * quantidade;		
	}


	@Override
	public String toString() {
		return	produto.getNome() + " - " + String.format("%.2f", pre�o) +", Quantidade: " + quantidade + " Valor Total: " + String.format("%.2f",subTotal());
	}


}
