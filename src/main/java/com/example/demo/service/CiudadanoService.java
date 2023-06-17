package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoService {
	
	public void agregar(Ciudadano ciudadano);
	public void actualizar(Integer id);
	public void buscar(Integer id);
	public void eliminar(Integer id);

}
