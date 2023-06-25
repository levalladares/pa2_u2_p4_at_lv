package com.example.demo.service;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	
	public void guardar (Matricula matricula,Alumno alumno,Materia materia);

}
