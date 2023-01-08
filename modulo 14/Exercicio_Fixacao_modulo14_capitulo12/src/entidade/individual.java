package entidade;

public class individual extends taxPlayer {
	
	private Double healthExpenditures;
	
	
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}



	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}



	public individual(String nome, Double anualincome, Double healthExpenditures) {
		super(nome, anualincome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public double taxa() {
		if(anualincome < 200000) {
			return anualincome = anualincome * 0.15;
		}else {
			return anualincome = anualincome * 0.25;
		}
		
		
		
	}

	
}
