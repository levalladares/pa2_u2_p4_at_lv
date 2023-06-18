package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
	
	public void agregar(Habitacion habitacion);
	public void actualizar(Integer id);
	public void buscar(Integer id);
	public void eliminar(Integer id);

}
