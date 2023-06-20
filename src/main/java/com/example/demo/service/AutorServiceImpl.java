package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository autorRepository;
	
	
	@Override
	public void guardar(Autor libro) {
	this.autorRepository.insertar(libro);
		
	}

	@Override
	public void actualizar(Integer id) {
	this.autorRepository.actualizar(id);
		
	}

	@Override
	public Autor buscar(Integer id) {
		
		return this.autorRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
	this.autorRepository.eliminar(id);;
		
	}

}
