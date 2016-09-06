package br.gov.sp.fatec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CLIENTE_ID")
	private Long idcliente;
		
	@Column(name = "CARRO_ID")
	public Long idcarro;

	@Column(name = "nome", length = 100)
	public String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}

	public Long getIdcarro() {
		return idcarro;
	}

	public void setIdcarro(Long idcarro) {
		this.idcarro = idcarro;
	}
	
}
