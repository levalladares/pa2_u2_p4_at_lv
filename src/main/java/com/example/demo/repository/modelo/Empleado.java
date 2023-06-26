package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="empleado")
@Entity
public class Empleado {
	
	@GeneratedValue(generator ="seq_empleado",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_empleado",sequenceName = "seq_empleado",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "empl_id")
	private Integer id;
	
	@Column(name = "empl_sueldo")
	private BigDecimal sueldo;
	
	@Column(name = "empl_cargo")
	private String cargo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empl_ciudadano_id")  //la columna donde la pk se hara fk
	private Ciudadano ciudadano;
	
	
	
	//set y get

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	

}
