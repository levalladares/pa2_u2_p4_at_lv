package com.example.demo.repository;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionRepository {
	
	public void insertar(Habitacion habitacion);
	public void actualizar(Integer id);
	public Habitacion seleccionar(Integer id);
	public void eliminar(Integer id);

}
