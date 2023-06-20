package com.example.demo.repository;

import com.example.demo.repository.modelo.Autor;


public interface AutorRepository {
	
	public void insertar(Autor libro);
	public void actualizar(Integer  id);
	public Autor seleccionar(Integer  id);
	public void eliminar(Integer  id);

}
