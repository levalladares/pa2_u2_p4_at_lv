package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	
	public void guardar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public void buscar(String nombre);
	public void eliminar(String nombre);

}
