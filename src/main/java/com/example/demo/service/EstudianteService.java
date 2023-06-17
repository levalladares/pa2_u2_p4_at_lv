package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void buscar(String cedula);
	public void eliminar(String cedula);

}
