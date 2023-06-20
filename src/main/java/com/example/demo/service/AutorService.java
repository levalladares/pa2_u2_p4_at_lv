package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;

public interface AutorService {

	public void guardar(Autor libro);
	public void actualizar(Integer  id);
	public Autor buscar(Integer  id);
	public void eliminar(Integer  id);
	
}
