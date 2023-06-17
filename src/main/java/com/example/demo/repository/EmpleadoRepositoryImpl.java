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
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.merge(id);
	}

	@Override
	public Empleado seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}
	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empleado=this.seleccionar(id);
		this.entityManager.remove(empleado);
	}

}
