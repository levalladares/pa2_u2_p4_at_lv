package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CiudadanoRepository;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CuidadanoServiceImpl implements CuidadanoService {

   @Autowired
   private CiudadanoRepository cuidadanoRepository;
	
	@Override
	public void guardar(Ciudadano ciudadano) {
		this.cuidadanoRepository.insertar(ciudadano);
		
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.cuidadanoRepository.actualizar(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id ) {
		 return this.cuidadanoRepository.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id ) {
		this.cuidadanoRepository.eliminar(id);
		
	}

}
