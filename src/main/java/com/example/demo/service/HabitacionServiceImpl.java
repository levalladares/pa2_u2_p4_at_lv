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
	public void agregar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepository.insertar(habitacion);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepository.actualizar(id);
		
	}

	@Override
	public void buscar(Integer id) {
		this.habitacionRepository.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.habitacionRepository.eliminar(id);
		
	}

}
