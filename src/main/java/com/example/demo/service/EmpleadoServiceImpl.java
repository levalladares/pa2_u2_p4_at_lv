package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoService;

	@Override
	public void agregar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoService.insertar( empleado);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoService.actualizar(id);
		
	}

	@Override
	public void buscar(Integer id) {
		this.empleadoService.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.empleadoService.eliminar(id);
		
	}

}
