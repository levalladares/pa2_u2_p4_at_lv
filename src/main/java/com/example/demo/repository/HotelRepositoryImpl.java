package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepositoryImpl implements HotelRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel Hotel) {
		this.entityManager.persist(Hotel);
		
	}

	@Override
	public void actualizar(Hotel Hotel) {
		this.entityManager.merge(Hotel);
		
	}

	@Override
	public Hotel seleccionar(String nombre) {
	
		return this.entityManager.find(Hotel.class, nombre);
	}

	@Override
	public void eliminar(String nombre) {
		Hotel hote = this.seleccionar(nombre);
		this.entityManager.remove(hote);
		
	}

}
