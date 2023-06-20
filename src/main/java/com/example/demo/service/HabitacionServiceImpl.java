package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HabitacionRepository;
import com.example.demo.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements HabitacionService {

	
	@Autowired
	private HabitacionRepository habitacionRepository;
	
	@Override
	public void guardar(Habitacion habitacion) {
	
		this.habitacionRepository.insertar(habitacion);
		
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.habitacionRepository.actualizar(habitacion);
		
	}

	@Override
	public Habitacion buscar(Integer id ) {
		 return this.habitacionRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id ) {
		this.habitacionRepository.eliminar(id);
		
	}
	
	

}
