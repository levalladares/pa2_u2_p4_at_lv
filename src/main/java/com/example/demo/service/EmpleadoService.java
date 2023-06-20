package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	
	public void guardar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id );
	public void eliminar(Integer id );

}
