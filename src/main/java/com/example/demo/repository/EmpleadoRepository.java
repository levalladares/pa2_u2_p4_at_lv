package com.example.demo.repository;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoRepository {
	
	public void insertar(Empleado empleado);
	public void actualizar(Integer id);
	public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
	
}