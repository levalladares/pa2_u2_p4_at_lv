package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements AutorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor libro) {
		this.entityManager.persist(libro);
		
	}

	@Override
	public void actualizar(Integer id) {
		this.entityManager.merge(id);
	}

	@Override
	public Autor seleccionar(Integer id) {
		
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Autor autor=this.seleccionar(id);
		this.entityManager.remove(autor);
		
	}
	
	

}
