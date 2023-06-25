package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "materia")
@Entity
public class Materia {
	@Id
	@GeneratedValue(generator ="seq_materia",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_materia",sequenceName = "seq_materia",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Column(name = "mate_id")
	private Integer id;
	
	@Column(name = "mate_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matricula;
	
	//GETYSET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(List<Matricula> matricula) {
		this.matricula = matricula;
	}

	
	

}
