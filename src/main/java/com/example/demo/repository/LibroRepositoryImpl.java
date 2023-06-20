package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements LibroRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro libro) {
		this.entityManager.persist(libro);
		
	}

	@Override
	public void actualizar(Integer id) {
		this.entityManager.merge(id);
		
	}

	@Override
	public Libro seleccionar(Integer id) {
	
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void eliminar(Integer id) {
	 Libro libro =this.seleccionar(id);
	 this.entityManager.remove(libro);
		
	}

}
