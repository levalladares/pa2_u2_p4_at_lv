package com.example.demo.repository;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionRepository {
	
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion seleccionar(String num);
	public void eliminar(String num);
}
