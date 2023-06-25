package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService {
	
	@Autowired
	MatriculaRepository matriculaRepository;

	@Override
	public void guardar(Matricula matricula,Alumno alumno,Materia materia) {
		
		matricula.setAlumno(alumno);
		matricula.setMateria(materia);
		this.matriculaRepository.insertar(matricula);
		
		
	}

}
