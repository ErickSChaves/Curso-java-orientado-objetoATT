package entidade;

public class Company extends taxPlayer {
	
	private Integer numberofEmployers;

	
	public Integer getNumberofEmployers() {
		return numberofEmployers;
	}



	public void setNumberofEmployers(Integer numberofEmployers) {
		this.numberofEmployers = numberofEmployers;
	}



	public Company(String nome, Double anualincome, Integer numberofEmployers) {
		super(nome, anualincome);
		this.numberofEmployers = numberofEmployers;
	}
	
	
	

}
