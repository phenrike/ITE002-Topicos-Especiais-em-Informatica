package br.gov.sp.fatec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CARRO")
public class Carro {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CARRO_ID")
	private Long idcarro;

	@Column(name = "PLACA", length = 100)
	public String placa;
	
	@Column(name = "MODELO", length = 100)
	public String modelo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Long getIdcarro() {
		return idcarro;
	}

	public void setIdcarro(Long idcarro) {
		this.idcarro = idcarro;
	}
	
}
