package entidade; 

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.OrdemStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Cliente cliente;
	private Date momento;
	private OrdemStatus status;
	

	private List<OrdemItem> Ordem = new  ArrayList<>();


	public Order(Date momento, OrdemStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public List<OrdemItem> getOrdem() {
		return Ordem;
	}
	
	public void addItem(OrdemItem order) {
		Ordem.add(order);
	}
	
	public void removeItem(OrdemItem Order) {
		Ordem.remove(Order);
	}
	
	public double totalproduto() {
		double r = 0;
		for (OrdemItem item: Ordem ) {
			r += item.subTotal();
		}
		
		return r;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem momento: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrdemItem item : Ordem) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", totalproduto()));
		return sb.toString();
	}
}

	

