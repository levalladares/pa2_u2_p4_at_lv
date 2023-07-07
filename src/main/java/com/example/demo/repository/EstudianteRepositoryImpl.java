package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		Query  myQuery =this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		Query  myQuery =this.entityManager.createNativeQuery("SELECT * FROM estudiante where estu_apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscarporApellidoNative",Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return  myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		Query  myQuery =this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		TypedQuery<Estudiante> myQuery =this.entityManager.createNamedQuery("Estudiante.buscarporNombreNative",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return  myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriAPIQuery(String apellido) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		
		//1.- en el primer paso vamos a especificar el tipo de retorno que tiene mi query
		CriteriaQuery<Estudiante> myCriteriaQuery= myBuilder.createQuery(Estudiante.class);
		
		//2.- empezamos a crear el sql
		//2.1 definimos el from (Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);
		
		//3.- contruir las condiciones del sql
		//   las condiciones se las conoce como PREDICADOS 
		// e.apellido =: datoApellido
		Predicate condicionApellido= myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		
		//4.- armar todo el sql final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);
		
		//5.- la ejecucion del query lo realizamos con typeDQuery
		TypedQuery<Estudiante>myQueryFinal=this.entityManager.createQuery(myCriteriaQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub

//      0.Declarar un constructor
      CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
      
//      1.Especificar el tipo de retorno que tiene mi Query
      CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);
//      2.
      Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);
      
//      3.Construye las condiciones
//      peso>100 e.nombre=?   AND e.apellido=? ?:dato que le envio
//      peso<=100 e.nombre=?  OR e.apellido=?
//      en cualqueir opcion hay 2 predicados
//      e.nombre=?
      Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);// nombre como objeto
//      e.apellido=?
      Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);// nombre como objeto

      // el and y el or es otra condicion predicado
      // and una de las 2
      // or o una u otra
      Predicate predicadofinal = null;
      if (peso.compareTo(Double.valueOf(100)) <= 0) {// si lo resalta esta obsoleto o no es necesario
          predicadofinal = myBuilder.or(pNombre, pApellido);
      } else {
          predicadofinal = myBuilder.and(pNombre, pApellido);
      }
      // atributo esta en mi tabla, condiciones estan dadas por metodos, hay mas
      // metodos bettew
//      4.Armamos mi sql final
      myCriteriaQuery.select(miTablaFrom).where(predicadofinal);
//      5.Ejecución del Query lo realizamos con TypedQuery
      TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);// puedo pasarle un objeto
                                                                                              // criteria query
      return myQueryFinal.getSingleResult();
	    }

	@Override
	public int actualizarPorApellido(String nombre,String apellido) {
		// TODO Auto-generated method stub
		//SQL
		//UPDATE estudiante SET estu_nombre=? WHERE estu_apellido=?
		//JPQL
		//UPDATE Estudiante e Set e.nombre= :datoNombre WHERE e.apellido= :datoApellido
		Query myQuery = this.entityManager
                .createQuery("UPDATE Estudiante e SET e.nombre=:datoNombre WHERE e.apellido=:datoApellido");
        myQuery.setParameter("datoNombre", nombre);
        myQuery.setParameter("datoApellido", apellido);
        return myQuery.executeUpdate();// unico metodo
		
		
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// DELETE FROM estudiante WHERE estu_nombre= ?
		// DELETE FROM Estudiante e where e.nombre= :datoNombre
		Query myQuery = this.entityManager.createQuery("DELETE  FROM Estudiante e WHERE e.nombre=:datoNombre");
        myQuery.setParameter("datoNombre", nombre);
        return myQuery.executeUpdate();// unico metodo

        // cuando elimino se actualiza la base de datos

        // listado actualizado:algunos ingresan otros eliminan

        // return el numero de registro afectados
		
		
	}
	

}