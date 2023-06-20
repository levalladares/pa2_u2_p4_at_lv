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

@Table(name="ctaBancaria")
@Entity
public class CtaBancaria {
	
	@GeneratedValue(generator ="seq_ctaBancaria",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_ctaBancaria",sequenceName = "seq_ctaBancaria",allocationSize = 1)
	@Id
	@Column(name ="cta_id")
	private Integer id;
	
	@Column(name ="cta_numero")
	private String numero;
	
	@Column(name ="cta_tipo")
	private String tipo ;
	
	@Column(name="cta_fechaA")
	private LocalDate fechaApertura;
	
	@Column(name="cta_saldo")
	private BigDecimal saldo;
	
	@Column(name="cta_cedula")
	private String cedulaPropietario;
	
	
	@Override
	public String toString() {
		return "CtaBancaria [numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura + ", saldo="
				+ saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public LocalDate getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}


	public BigDecimal getSaldo() {
		return saldo;
	}


	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}


	public String getCedulaPropietario() {
		return cedulaPropietario;
	}


	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	
	
	
	
	

}
