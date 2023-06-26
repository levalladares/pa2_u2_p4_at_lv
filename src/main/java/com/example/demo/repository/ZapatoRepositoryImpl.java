package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.repository.modelo.Zapato;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ZapatoRepositoryImpl implements ZapatoRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Zapato zapato) {
		this.entityManager.persist(zapato);//para agregar, y recibe un entity que ya se hizo en el mapeo de la clase estudiante
	}


	@Override
	public Zapato seleccionarPorIDunico(String codigoUnico) {
		Query myQuery=this.entityManager.createQuery("select e from Zapato e where e.codigoUnico = :datoCodigoUnico");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoCodigoUnico",codigoUnico);
		return (Zapato) myQuery.getSingleResult();
	}


	@Override
	public List<Zapato> seleccionarListaPorMarca(String marca) {
		Query myQuery=this.entityManager.createQuery("select e from Zapato e where e.marca = :datoMarca");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoMarca",marca);
		return myQuery.getResultList();
	}


	@Override
	public Zapato seleccionarPorMarcayPrecio(String marca, BigDecimal precio) {
		Query myQuery=this.entityManager.createQuery("select e from Zapato e where e.marca = :datoMarca and e.precio=:datoPrecio");// el de los 2 puntos es un atributo 
		myQuery.setParameter("datoMarca",marca);
		myQuery.setParameter("datoPrecio",precio);
		return (Zapato) myQuery.getSingleResult();
	}


	@Override
	public Zapato seleccionarPorNombreTyped(String nombre) {
		TypedQuery<Zapato> myQuery = this.entityManager
                .createQuery("SELECT e FROM Zapato e WHERE e.nombre=:datoNombre", Zapato.class);
        myQuery.setParameter("datoNombre", nombre);
        return myQuery.getSingleResult();
	}


	@Override
	public List<Zapato> seleccionarPorFecha(LocalDate fechaFabricacion) {
		TypedQuery<Zapato> myQuery = this.entityManager
                .createQuery("SELECT e FROM Zapato e WHERE e.fechaFabricacion=:datoFechaFabricacion", Zapato.class);
        myQuery.setParameter("datoFechaFabricacion", fechaFabricacion);
        return myQuery.getResultList();
	}

}
