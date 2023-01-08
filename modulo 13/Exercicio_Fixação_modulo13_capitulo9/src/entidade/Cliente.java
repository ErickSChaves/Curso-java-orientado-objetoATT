package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date anoNascimento;
	
	

	public Cliente(String nome, String email, Date anoNascimento) {
		this.nome = nome;
		this.email = email;
		this.anoNascimento = anoNascimento;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Date anoNascimento) {
		this.anoNascimento = anoNascimento;
	}



	@Override
	public String toString() {
		return nome + " (" + sdf.format(anoNascimento) + ") - " + email;
	}
	
	
	
}
