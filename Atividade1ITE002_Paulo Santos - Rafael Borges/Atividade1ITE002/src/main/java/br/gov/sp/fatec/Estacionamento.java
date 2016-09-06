package br.gov.sp.fatec;

import java.util.ArrayList;

public class Estacionamento {

	public Cliente cliente;
	public ArrayList<Cliente> vagas;
	
	public Estacionamento() {
		vagas = new ArrayList<Cliente>(40);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String guardarCarroCliente() {
		vagas.add(cliente);
		return "O " + cliente.getCarro().getModelo() + " do cliente " + cliente.getNome() + " foi guardado.";
	}

}
