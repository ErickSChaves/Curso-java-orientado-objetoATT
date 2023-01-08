package Entidade;

public class produto {
	
	private String nome;
	protected Double preco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public produto(){
		
	}	
	
	public produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String priceTag() {
		return " Preço do produto $" + getPreco();
	}

	
	
}
