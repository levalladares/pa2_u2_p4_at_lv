package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;

@Service

public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public void guardar(Empleado empleado) {
	this.empleadoRepository.insertar(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepository.actualizar(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id ) {
	return this.empleadoRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id ) {
	this.empleadoRepository.eliminar(id);
		
	}

}
