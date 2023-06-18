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
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.merge(id);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}
	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel=this.seleccionar(id);
		this.entityManager.remove(hotel);
	}

}
