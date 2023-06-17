package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoRepository {
	
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Integer id);
	public Ciudadano seleccionar(Integer id);
	public void eliminar(Integer id);

}
