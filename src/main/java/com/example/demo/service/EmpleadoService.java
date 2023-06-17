package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	public void agregar(Empleado empleado);
	public void actualizar(Integer id);
	public void buscar(Integer id);
	public void eliminar(Integer id);


}
