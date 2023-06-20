package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements EmpleadoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado seleccionar(Integer id ) {
	
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id ) {
		Empleado emple=this.seleccionar(id);
		this.entityManager.remove(emple);
	}

}
