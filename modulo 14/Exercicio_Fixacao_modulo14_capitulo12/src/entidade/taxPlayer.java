package entidade;

public class taxPlayer {

	private String nome;
	protected Double anualincome;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getAnualincome() {
		return anualincome;
	}

	public void setAnualincome(Double anualincome) {
		this.anualincome = anualincome;
	}

	public taxPlayer(String nome, Double anualincome) {
		super();
		this.nome = nome;
		this.anualincome = anualincome;
	}
	
	public taxPlayer() {
		super();
	}
	
}
