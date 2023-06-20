package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Transactional
@Repository
public class HabitacionRepositoryImpl implements HabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public void actualizar(Habitacion habitacion ) {
		this.entityManager.merge(habitacion);
		
	}

	@Override
	public Habitacion seleccionar(String num) {
		
		return this.entityManager.find(Habitacion.class, num);
	}

	@Override
	public void eliminar(String num) {
		Habitacion habitacion = this.seleccionar(num);
		this.entityManager.remove(habitacion);
		
	}
	
	
	}

