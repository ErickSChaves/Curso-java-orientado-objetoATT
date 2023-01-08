package entidade;
import exception.exceptionConta;

public class conta {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiSaque;
	
	
	
	public conta(Integer numero, String nome, Double saldo, Double limiSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiSaque = limiSaque;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getLimiSaque() {
		return limiSaque;
	}
	
	public void setLimiSaque(Double limiSaque) {
		this.limiSaque = limiSaque;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void Saque(double saque ) {
		if(limiSaque < saque) {
			throw new exceptionConta("Voce tentou sacar um valor maior que o seu limite");
		}else if(saque > saldo){
			throw new exceptionConta("Voce tentou sacar um valor maior que o saldo que vc tem na sua conta");		
		}else {
			saldo = saldo - saque;
			throw new exceptionConta("Saldo atualizado " + getSaldo());
		}
	
	}
	
}	
