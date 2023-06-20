package com.example.demo.repository.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="autor")
public class Autor {
	
	
	@GeneratedValue(generator ="seq_autor",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_autor",sequenceName = "seq_autor",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "autor_id")
	private Integer id;
	
	@Column(name = "autor_nombre")
	private String nombre;
	
	@Column(name = "autor_apellido")
	private String apeliido;
	
	@ManyToMany(mappedBy = "autores",cascade = CascadeType.ALL)// para mapear
	private Set<Libro> libros;
	
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apeliido=" + apeliido + ", libros=" + libros + "]";
	}

	//set y get 
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

	public String getApeliido() {
		return apeliido;
	}

	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	

}
