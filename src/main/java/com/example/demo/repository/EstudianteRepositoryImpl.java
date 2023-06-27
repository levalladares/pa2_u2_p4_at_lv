package com.example.demo.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		//SQL
		//select * from estudiante e where e.estu_apellido = 
		//JPQL
		//select e from Estudiante e where e.apellido = 
		Query myQuery=this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoApellido",apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query myQuery=this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoApellido",apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery=this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido and e.nombre=:datoNombre");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoApellido",apellido);
		myQuery.setParameter("datoNombre",nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// interactuar con la bd this.entityManager.createQuery("JPQL",
        // Estudiante.class);
        TypedQuery<Estudiante> myQuery = this.entityManager
                .createQuery("SELECT e FROM Estudiante e WHERE e.apellido=:datoApellido", Estudiante.class);
        myQuery.setParameter("datoApellido", apellido);
        return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscaPorAppelido",Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

}