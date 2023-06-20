package com.example.demo.repository;

import com.example.demo.repository.modelo.Libro;

public interface LibroRepository {
	
	public void insertar(Libro libro);
	public void actualizar(Integer  id);
	public Libro seleccionar(Integer  id);
	public void eliminar(Integer  id);

}
