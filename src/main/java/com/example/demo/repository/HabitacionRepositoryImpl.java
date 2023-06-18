package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements HabitacionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.merge(id);
	}

	@Override
	public Habitacion seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}
	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Habitacion habitacion=this.seleccionar(id);
		this.entityManager.remove(habitacion);
	}

}
