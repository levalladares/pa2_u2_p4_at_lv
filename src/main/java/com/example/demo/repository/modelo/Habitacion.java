package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion {
	
	@GeneratedValue(generator ="seq_habitacion",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_habitacion",sequenceName = "seq_habitacion",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "habi_id")
	private Integer id;
	@Column(name = "habi_numero")
	private String numero;
	@Column(name = "habi_valor")
	private BigDecimal valor;
	
	@ManyToOne(cascade = CascadeType.ALL) //>>>>>>>>> mmuchas habitaciones tiene un hotel
	@JoinColumn(name = "habi_id_hotel") //para clave foranea
	private Hotel hotel;
	
	//SET Y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
