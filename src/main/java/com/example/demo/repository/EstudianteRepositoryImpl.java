package com.example.demo.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);//para agregar, y recibe un entity que ya se hizo en el mapeo de la clase estudiante
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);//para actualizar
		
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		 return this.entityManager.find(Estudiante.class, cedula);//realiza la busqueda
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu=this.seleccionar(cedula);
		this.entityManager.remove(estu);
	
	}

}