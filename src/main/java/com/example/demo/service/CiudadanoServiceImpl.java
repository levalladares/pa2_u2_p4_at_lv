package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CiudadanoRepository;
import com.example.demo.repository.modelo.Ciudadano;
@ Service
public class CiudadanoServiceImpl implements CiudadanoService {
	
	@Autowired
	private CiudadanoRepository ciudadanoRepository;

	@Override
	public void agregar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.insertar(ciudadano);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.actualizar(id);
		
	}

	@Override
	public void buscar(Integer id) {
		this.ciudadanoRepository.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.ciudadanoRepository.eliminar(id);
		
	}
	

}
