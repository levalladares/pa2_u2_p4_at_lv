package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {
	
	public void insertar(Hotel Hotel);
	public void actualizar(Hotel Hotel);
	public Hotel seleccionar(String nombre);
	public void eliminar(String nombre);
	

}
