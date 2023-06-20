package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
	
	public void guardar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public void buscar(String num);
	public void eliminar(String num);

}
