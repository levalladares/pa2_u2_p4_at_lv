package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	
	public void construir(Hotel hotel);
	public void actualizar(Integer id);
	public void buscar(Integer id);
	public void eliminar(Integer id);


}
