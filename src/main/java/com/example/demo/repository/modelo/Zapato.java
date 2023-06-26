package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "zapato")
@Entity
public class Zapato {
	
	@GeneratedValue(generator ="seq_zapato",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_zapato",sequenceName = "seq_zapato",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "zapa_id")
	private Integer id;
	
	@Column(name = "zapa_nombre")
	private String nombre;
	@Column(name = "zapa_marca")
	private String marca;
	@Column(name = "zapa_precio")
	private BigDecimal precio;
	@Column(name = "zapa_fechaFabricacion")
	private LocalDate fechaFabricacion;
	@Column(name = "zapa_codigoUnico")
	private String codigoUnico;
	
	
	// TO STRING
	@Override
	public String toString() {
		return "Zapato [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", fechaFabricacion=" + fechaFabricacion +"codigoUnico"+codigoUnico+ "]\n";
	}
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoUnico() {
		return codigoUnico;
	}
	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
	
	
	
	
}
