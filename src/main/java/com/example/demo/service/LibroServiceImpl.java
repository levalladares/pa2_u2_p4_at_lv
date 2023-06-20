package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LibroRepository;
import com.example.demo.repository.modelo.Libro;

@Service
public class LibroServiceImpl implements LibroService{

	
	@Autowired
	private LibroRepository libroRepository ;
	
	@Override
	public void guardar(Libro libro) {
		this.libroRepository.insertar(libro);
		
	}

	@Override
	public void actualizar(Libro libro) {
		this.libroRepository.actualizar(libro);
		
	}

	@Override
	public Libro buscar(Integer id) {
		
		return this.libroRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.libroRepository.eliminar(id);
		
	}

}
