package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante seleccionar(String cedula);
	public void eliminar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);
	public  List<Estudiante> seleccionarListaPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoyNombre(String apellido,String nombre);
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	public Estudiante seleccionarPorApellidoNamed(String apellido);
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	public Estudiante seleccionarPorNombreNamedQuery(String nombre);
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
	public Estudiante seleccionarPorApellidoCriteriAPIQuery(String apellido);
	
}
