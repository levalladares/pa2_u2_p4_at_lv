package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void construir(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(id);
		
	}

	@Override
	public void buscar(Integer id) {
		this.hotelRepository.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.hotelRepository.eliminar(id);
		
	}
	

}
